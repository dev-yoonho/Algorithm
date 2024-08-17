import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		// 테스트 케이스의 개수 t
		int t = Integer.parseInt(br.readLine());
		// 테스트 케이스 순회 시작
		for (int tc = 1;tc <= t;tc++) {
			// 삼각형의 크기 n
			int n = Integer.parseInt(br.readLine());
			
			bw.write("#" + tc + "\n");
			
			// 삼각형을 그릴 n * n 크기의 정수 배열 생성
			int[][] board = new int[n][n];
			
			// 배열 채우기 = 삼각형 그리기
			for (int i = 0;i < n;i++) {
				board[i][0] = 1;
				for (int j = 1;j < i + 1;j++) {
					board[i][j] = board[i - 1][j - 1] + board[i - 1][j];
				}
			}
			
			for (int[] line:board) {
				for (int num:line) {
					if (num != 0) {
						bw.write(num + " ");
					}
				}
				bw.write("\n");
			}
			
			
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
}