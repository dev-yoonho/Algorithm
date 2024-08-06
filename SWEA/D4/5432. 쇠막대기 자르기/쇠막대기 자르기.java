import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 테스트 케이스 개수 t
		int t = Integer.parseInt(br.readLine());
		
		// 테스트 케이스 순회 시작
		for (int tc = 1;tc <= t;tc++) {
			String stickLazer = br.readLine();
			// count는 짝이 있기 전까지 열린 괄호의 개수를 셈, sum은 레이저가 나오거나 닫힌 괄호일떄
			int sum = 0, count = 0;
			
			for (int i = 0;i < stickLazer.length();i++) {
				// 레이저인지 쇠막대인지 모르니까 일단 카운트 + 1
				if (stickLazer.charAt(i) == '(') {
					count++;
				} else if (stickLazer.charAt(i - 1) == '(' && stickLazer.charAt(i) == ')') {
					count--;
					sum += count;
				} else {
					sum++;
					count--;
				}
			}
			bw.write(String.format("#%d %d\n", tc, sum));
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
}