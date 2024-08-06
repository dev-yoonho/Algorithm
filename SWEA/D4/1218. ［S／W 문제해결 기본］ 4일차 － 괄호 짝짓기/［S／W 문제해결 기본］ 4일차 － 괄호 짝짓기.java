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
		
		Stack<Character> stack;
		
		for (int tc = 1;tc <= 10;tc++) {
			int caseLength = Integer.parseInt(br.readLine());
			// 테스트 케이스 문자열 입력 받기
			String testCase = br.readLine();
			// 만약 문자열의 길이가 홀수면 짝이 안맞으므로 유효성 0
			if (caseLength % 2 != 0) {
				bw.write(String.format("#%d 0\n", tc));
				continue;
			}
			
			// 초기 유효성
			int result = 1;
			
			stack = new Stack<>();
		
			outer:
				for (int i = 0;i < testCase.length();i++) {
					char ch = testCase.charAt(i);
					// 만약 스택이 비어있고
					if (stack.isEmpty()) {
						// 닫는 괄호가 들어온다면
						if (closeCase(ch)) {
							result = 0;
							continue outer;
						} else { // 여는 괄호가 들어온다면
							stack.push(ch);
						}
					} else { // 스택이 비어있지 않고
						// 닫는 괄호가 들어온다면
						if (closeCase(ch)) {
							if (comparison(stack.pop(), ch)) {
								continue;
							} else {
								result = 0;
								continue outer;
							}
						} else { // 여는 괄호가 들어온다면
							stack.push(ch);
						}
					}
				}
			bw.write(String.format("#%d %d\n", tc, result));
		}
		bw.flush();
		
		br.close();
		bw.close();
	}

	static boolean comparison(Character pop, char ch) {
		if ((pop == '[' && ch == ']') || (pop == '{' && ch == '}') ||
			(pop == '(' && ch == ')') || (pop == '<' && ch == '>')) {
			return true;
		}
		return false;
	}

	static boolean closeCase(char ch) {
		if (ch == ']' || ch == ')' || ch == '}' || ch == '>') {
			return true;
		}
		return false;
	}
}