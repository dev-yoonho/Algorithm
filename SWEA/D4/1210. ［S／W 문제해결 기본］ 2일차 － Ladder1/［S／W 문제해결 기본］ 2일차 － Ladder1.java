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
		
		// 시작점의 열 인덱스 값 시작점 - board[99][c]
		int startIdxC = -1;
		
		for (int i = 0;i < 10;i++) {
			// 테스트 케이스 번호
			int t = Integer.parseInt(br.readLine());
			
			// 사다리 배열 입력
			int[][] board = new int[100][100];
			for (int r = 0;r < 100;r++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int c = 0;c < 100;c++) {
					board[r][c] = Integer.parseInt(st.nextToken());
				}
			}
			
			// 시작점의 열 인덱스 검색
			for (int c = 0;c < 100;c++) {
				if (board[99][c] == 2) {
					startIdxC = c;
					break;
				}
			}
			
			int r = 98, c = startIdxC;
			while (r > 0) {
                // 좌우 이동시 배열을 벗어나는지 체크하고 시작
                if (c + 1 < 100 && board[r][c + 1] == 1) {
                    while (c + 1 < 100 && board[r][c + 1] == 1) {
                        c++;
                    }
                } else if (c - 1 >= 0 && board[r][c - 1] == 1) {
                    while (c - 1 >= 0 && board[r][c - 1] == 1) {
                        c--;
                    }
                }
                // 이동 후 행 감소
                r--;
            }
			// 출발점 출력
			bw.write(String.format("#%d %d\n", t, c));
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
}