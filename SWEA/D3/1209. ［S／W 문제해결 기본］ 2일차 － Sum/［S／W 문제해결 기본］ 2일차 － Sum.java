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
		
		for (int t = 0;t < 10;t++) {
			// 테스트 케이스 번호
			int tc = Integer.parseInt(br.readLine());
			
			// 배열 입력
			int[][] board = new int[100][100];
			for (int r = 0;r < 100;r++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int c = 0;c < 100;c++) {
					board[r][c] = Integer.parseInt(st.nextToken());
				}
			}
			
			// 출력할 값 초기화 및 선언
			int result = 0;
			
			// 각 행의 합
			for (int r = 0;r < 100;r++) {
				int temp = 0;
				for (int c = 0;c < 100;c++) {
					temp += board[r][c];
				}
				result = Math.max(result, temp);
			}
			
			// 각 열의 합
			for (int c = 0;c < 100;c++) {
				int temp = 0;
				for (int r = 0;r < 100;r++) {
					temp += board[r][c];
				}
				result = Math.max(result, temp);
			}
			
			// 각 대각선의 합
			int temp1 = 0, temp2 = 0;
			for (int i = 0;i < 100;i++) {
				temp1 += board[0 + i][0 + i];
				temp2 += board[0 + i][99 - i];
			}
			result = Math.max(result, Math.max(temp1, temp2));
			
			bw.write(String.format("#%d %d\n", tc, result));
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
}