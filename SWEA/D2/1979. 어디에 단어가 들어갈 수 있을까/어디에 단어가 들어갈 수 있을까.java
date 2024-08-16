import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
			// 단어 퍼즐의 가로세로 길이 n, 단어의 길이 k
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
			// 단어 퍼즐 입력
			int[][] puzzle = new int[n][n];
			for (int i = 0;i < n;i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0;j < n;j++) {
					puzzle[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			// 결과 count
			int count = 0;
			
			// 행 돌면서 체크
			for (int i = 0;i < n;i++) {
				int length = 0;
				for (int j = 0;j < n;j++) {
					if (puzzle[i][j] == 1) {
						length++;
					} else {
						if (length == k) count++;
						length = 0;
					}
				}
				if (length == k) count++;
			}
			
			// 열 돌면서 체크
			for (int j = 0;j < n;j++) {
				int length = 0;
				for (int i = 0;i < n;i++) {
					if (puzzle[i][j] == 1) {
						length++;
					} else {
						if (length == k) count++;
						length = 0;
					}
				}
				if (length == k) count++;
			}		
			
			
			bw.write(String.format("#%d %d\n", tc, count));
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
}