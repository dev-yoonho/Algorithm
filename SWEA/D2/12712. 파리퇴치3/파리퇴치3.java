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
		
		// 델타 값(크로스 - 북 동 남 서)
		int[] dxc = {0, 1, 0, -1};
		int[] dyc = {-1, 0, 1, 0};
		
		// 델타 값(멀티플 - 북동 동남 남서 북서)
		int[] dxm = {1, 1, -1, -1};
		int[] dym = {-1, 1, 1, -1};
		
		// 테스트 케이스 개수 입력
		int t = Integer.parseInt(br.readLine());
		
		// 테스트 케이스 시작
		for (int i = 1;i <= t;i++) {
			// 배열의 크기 n, 스프레이의 세기 m
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			// 배열 입력 받기
			int[][] board = new int[n][n];
			for (int r = 0;r < n;r++) {
				StringTokenizer st2 = new StringTokenizer(br.readLine());
				for (int c = 0;c < n;c++) {
					board[r][c] = Integer.parseInt(st2.nextToken());
				}
			}
			
			// 최대 퇴치 수
			int killSumMax = 0;
			
			// 파리 잡기 시작(배열 순회하며 크로스와 멀티플 분사의 경우 각각 체크)
			for (int r = 0;r < n;r++) {
				for (int c = 0;c < n;c++) {
					int tempC = board[r][c], tempM = board[r][c];
					// 크로스
					for (int d = 0;d < 4;d++) {
						for (int k = 1;k < m;k++) {
							if (r + dxc[d] * k >= 0 && r + dxc[d] * k < n && c + dyc[d] * k >= 0 && c + dyc[d] * k < n)
								tempC += board[r + dxc[d] * k][c + dyc[d] * k];
						}
					}
					// 멀티플
					for (int d = 0;d < 4;d++) {
						for (int k = 1;k < m;k++) {
							if (r + dxm[d] * k >= 0 && r + dxm[d] * k < n && c + dym[d] * k >= 0 && c + dym[d] * k < n)
								tempM += board[r + dxm[d] * k][c + dym[d] * k];
						}
					}
					killSumMax = Math.max(killSumMax, Math.max(tempC, tempM));
				}
			}
			bw.write(String.format("#%d %d\n", i, killSumMax));
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
}