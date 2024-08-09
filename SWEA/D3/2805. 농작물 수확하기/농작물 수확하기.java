import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Comparator;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		// 테스트 케이스의 개수 t
		int t = Integer.parseInt(br.readLine());
		// 테스트 케이스 순회시작
		for (int tc = 1;tc <= t;tc++) {
			// 농장의 크기 n
			int n = Integer.parseInt(br.readLine());
			// 농장 배열 farm
			int[][] farm = new int[n][n];
			// 배열에 값 입력
			for (int i = 0;i < n;i++) {
				String str = br.readLine();
				for (int j = 0;j < n;j++) {
					farm[i][j] = Character.getNumericValue(str.charAt(j));
				} 
			}
			
			int start = n / 2, end = n / 2;
			
			int sum = 0;
			
			for (int r = 0;r < n;r++) {
				if (r < n / 2) {
					for (int c = start;c <= end;c++) {
						sum += farm[r][c];
					}
					start--;
					end++;
				} 
				else if (r == n / 2) {
					for (int c = start;c <= end;c++) {
						sum += farm[r][c];
					}
				} 
				else {
					++start;
					--end;
					for (int c = start;c <= end;c++) {
						sum += farm[r][c];
					}
				}
			}
			bw.write(String.format("#%d %d\n", tc, sum));
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
}