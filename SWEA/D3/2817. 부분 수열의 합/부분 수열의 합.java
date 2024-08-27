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
		
		for (int tc = 1;tc <= t;tc++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
			
			// 자연수 수열 A
			st = new StringTokenizer(br.readLine()); 
			
			int[] A = new int[N];
			for (int i = 0;i < N;i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}
			
			// 부분 수열의 합이 K가 되는 경우의 수 cnt
			int cnt = 0;
			
			// 부분 수열의 합 sum
			int sum;
			
			for (int i = 0;i < 1 << N;i++) {
				sum = 0;
				for (int j = 0;j < N;j++) {
					if ((i & (1 << j)) > 0) {
						if (sum > K) break;
						sum += A[j];
					}
				}
				if (sum == K) cnt++;
			}
			bw.write(String.format("#%d %d\n", tc, cnt));
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
}