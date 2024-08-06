import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.HashMap;
import java.util.Map;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int tc = 1;tc <=10;tc++) {
			br.readLine();
			
			String expression = br.readLine();
			
			bw.write(String.format("#%d %d\n", tc, evaluate(expression)));
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
	
	static Map<Character, Integer> map = new HashMap<>();
	
	static {
		map.put('+', 1);
		map.put('-', 1);
		map.put('*', 2);
		map.put('/', 2);
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
				int result;
				if (c == '+') {
					result = num2 + num1;
				} else if (c == '-') {
					result = num2 - num1;
				} else if (c == '*') {
					result = num2 * num1;
				} else {
					result = num2 / num1;
				}
				stack.push(result);
			}
		}
		return stack.peek();
	}

	private static String infixToPrefix(String expression) {
		Stack<Character> stack = new Stack<>();
		
		String prefix = "";
		
		for (int i = 0;i < expression.length();i++) {
			char c = expression.charAt(i);
			// 피연산자
			if ('0' <= c && c <= '9') {
				prefix += c;
			// 여는 괄호
			} else if (c == '(') {
				stack.push(c);
			// 닫는 괄호 - 여는 괄호가 보일 때까지 내부 요소 pop()
			} else if (c == ')') {
				char popItem = stack.pop();
				while (popItem != '(') {
					prefix += popItem;
					popItem = stack.pop();
				}
			} else {
				while (!stack.isEmpty() && stack.peek() != '(' && map.get(stack.peek()) >= map.get(c)) {
					prefix += stack.pop();
				}
				stack.push(c);
			}
		}
		while (!stack.isEmpty()) {
			prefix += stack.pop();
		}
		return prefix;
	}
}