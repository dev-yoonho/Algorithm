import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 테스트 케이스의 개수 입력
		int t = Integer.parseInt(br.readLine());
		for (int i = 1;i <= t;i++) {
			// 배열 크기 n, 파리채 크기 m
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			// 배열 채우기
			int[][] board = new int[n][n];
			for (int r = 0;r < n;r++) {
				StringTokenizer st2 = new StringTokenizer(br.readLine());
				for (int c = 0;c < n;c++) {
					board[r][c] = Integer.parseInt(st2.nextToken());
				}
			}
			int killSumMax = 0;
			// 실제로 검사하면 되는 곳은 n-m 행/열
			for (int r = 0;r <= n - m;r++) {
				for (int c = 0;c <= n - m;c++) {
					int tempKillSum = 0;
					for (int dr = 0;dr < m;dr++) {
						for (int dc = 0;dc < m;dc++) {
							tempKillSum += board[r+ dr][c + dc];
						}
					}
					killSumMax = Math.max(killSumMax, tempKillSum);
				}
			}
			bw.write(String.format("#%d %d\n", i, killSumMax));
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
}