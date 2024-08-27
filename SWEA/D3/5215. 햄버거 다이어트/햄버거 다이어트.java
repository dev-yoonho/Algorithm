import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution { // 부분집합 문제

	static int[][] ingredient; // 재료배열 - 맛 점수, 칼로리
	static int N, L;
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		// 테스트 케이스의 개수 t
		int t = Integer.parseInt(br.readLine());
		
		for (int tc = 1;tc <= t;tc++) {
			// 재료의 수 N, 제한 칼로리 L
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken()); 
			L = Integer.parseInt(st.nextToken());
			
			// 재료 배열 준비
			ingredient = new int[N][2];
			for (int i = 0;i < N;i++) {
				st = new StringTokenizer(br.readLine());
				ingredient[i][0] = Integer.parseInt(st.nextToken());
				ingredient[i][1] = Integer.parseInt(st.nextToken());
			}
			// 칼로리 합 cal, 점수 합 scr
			int cal, scr;
			
			int result = 0;
			
			for (int i = 0;i < (1 << N);i++) {
				cal = 0;
				scr = 0;
				for (int j = 0;j < N;j++) {
					if ((i & (1 << j)) > 0) {
						cal += ingredient[j][1];
						scr += ingredient[j][0];
					}
				}
				result = cal <= L && scr > result ? scr:result;
			}
			bw.write(String.format("#%d %d\n", tc, result));
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
}