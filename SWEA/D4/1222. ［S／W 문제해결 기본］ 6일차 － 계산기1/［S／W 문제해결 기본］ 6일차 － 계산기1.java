import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 테스트 케이스 순회 시작
		for (int tc = 1;tc <= 10;tc++) {
			// 문자열 계산식의 길이 l
			br.readLine();
			// 문자열 계산식 expression
			String expression = br.readLine();
			
			bw.write(String.format("#%d %d\n", tc, evaluate(expression)));
		}
		bw.flush();
		
		br.close();
		bw.close();
	}

	static int evaluate(String expression) {
		return evalPrefix(infixToPrefix(expression));
	}
	
	static int evalPrefix(String prefix) {
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0;i < prefix.length();i++) {
			char c = prefix.charAt(i);
			
			if ('0' <= c && c <= '9') {
				stack.push(c - '0');
			} else {
				int num1 = stack.pop();
				int num2 = stack.pop();
				stack.push(num2 + num1);
			}
		}
		return stack.peek();
	}
	
	static String infixToPrefix(String expression) {
		// 반환값이 될 후위 표기식
		String prefix = "";
		
		Stack<Character> stack = new Stack<>();
	
		for (int i = 0;i < expression.length();i++) {
			char c = expression.charAt(i);
			
			// 피연산자면 바로 출력
			if ('0' <= c && c <= '9') {
				prefix += c;
			} else {
				if (stack.isEmpty()) {
					stack.push(c);
				}
				else {
					prefix += stack.pop();
					stack.push(c);
				}
			}
		}
		while (!stack.isEmpty()) {
			prefix += stack.pop();
		}
		return prefix;
	}
}