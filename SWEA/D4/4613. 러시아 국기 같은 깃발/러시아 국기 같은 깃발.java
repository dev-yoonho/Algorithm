import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
	
	static int t; // 테스트 케이스의 수
	static int n, m; // n 개의 줄, m 개의 문자
	static char[][] board;
	static int cnt; // 최소한으로 칠해야 하는 칸의 수
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		// 테스트 케이스의 개수 t
		t = Integer.parseInt(br.readLine());
		// 테스트 케이스 순회 시작
		for (int tc = 1; tc <= t; tc++) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken()); 
			m = Integer.parseInt(st.nextToken());
			
			board = new char[n][m];
			
			for (int i = 0;i < n;i++) {
				board[i] = br.readLine().toCharArray();
			}
			int W = 0;
			int B;
			int R;
			
			cnt = Integer.MAX_VALUE;
			
			for (int i = 0;i < n - 2;i++) { // 흰색 확인
				W += checkColor('W',i);
				B = 0;
				for (int j = i + 1;j < n - 1;j++) { // 파란색 확인
					B += checkColor('B', j);
					R = 0;
					for (int k = j + 1;k < n;k++) { // 빨간색 확인
						R += checkColor('R', k);
					}
					cnt = Math.min(cnt, W + B + R);
				}
			}
			bw.write(String.format("#%d %d\n", tc, cnt));
		}
		bw.flush();
		
		br.close();
		bw.close();
	}

	static int checkColor(char color, int i) {
		int cnt = 0;
		for (int c = 0;c < m;c++) {
			if (board[i][c] != color) cnt++;
		}
		return cnt;
	}
}