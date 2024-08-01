import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 테스트는 10번 진행됨
		for (int t = 0;t < 10;t++) {
			// 테스트 케이스 번호
			int tc = Integer.parseInt(br.readLine());
			// 검색 문자열
			String str = br.readLine();
			// 검색이 진행되는 문자열
			String sentence = br.readLine();
			// 문자열 개수
			int cnt = 0;
			// 검색 문자열 길이
			int n = str.length();
			// 검색 진행 문자열 길이
			int m = sentence.length();
			// 탐색 시작
			for (int i = 0;i < m - n + 1;i++) {
				if (sentence.substring(i, i + n).equals(str)) {
					cnt++;
				}
			}
			bw.write(String.format("#%d %d\n", tc, cnt));
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
}