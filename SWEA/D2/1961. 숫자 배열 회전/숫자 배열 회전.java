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
			// 행렬의 크기 n
			int n = Integer.parseInt(br.readLine());
			// 행렬은 후에 수를 이어 붙이기 용이하기 위해 문자열 배열로 생성한다.
			String[][] board = new String[n][n];
			for (int i = 0;i < n;i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0;j < n;j++) {
					board[i][j] = st.nextToken();
				}
			}
			
			// 결과 배열은 항상 n X 3 크기로 생성된다.
			String[][] result = new String[n][3];
			for (int i = 0;i < n;i++) {
				for (int j = 0;j < 3;j++) {
					result[i][j] = "";
				}
			}
			
			int idx = 0;
			// 90도 채우기 - 결과 배열 각 행의 0번 인덱스
			for (int j = 0;j < n;j++) {
				for (int i = n - 1;i >= 0;i--) {
					result[idx][0] += board[i][j];
				}
				idx++;
			}
			idx = 0;
			// 180도 채우기 - 결과 배열 각 행의 1번 인덱스
			for (int i = n - 1;i >= 0;i--) {
				for (int j = n - 1;j >= 0;j--) {
					result[idx][1] += board[i][j];
				}
				idx++;
			}
			idx = 0;
			// 270도 채우기 - 결과 배열 각 행의 2번 인덱스
			for (int j = n - 1;j >= 0;j--) {
				for (int i = 0;i < n;i++) {
					result[idx][2] += board[i][j];
				}
				idx++;
			}
			bw.write("#" + tc + "\n");
			for (String[] line:result) {
				for (String num:line) {
					bw.write(num + " ");
				}
				bw.write("\n");
			}
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
}