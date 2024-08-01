import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 테스트 케이스 개수
		int t = Integer.parseInt(br.readLine());
		
		for (int tc = 0;tc < t;tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			// A의 수 n, B의 수 m
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			// A 배열
			int[] A = new int[n];
			StringTokenizer stA = new StringTokenizer(br.readLine());
			for (int i = 0;i < n;i++) {
				A[i] = Integer.parseInt(stA.nextToken());
			}
			Arrays.sort(A);
			// B 배열
			int[] B = new int[m];
			StringTokenizer stB = new StringTokenizer(br.readLine());
			for (int i = 0;i < m;i++) {
				B[i] = Integer.parseInt(stB.nextToken());
			}
			Arrays.sort(B);
			// 총 쌍의 개수 
			int result = 0;
			for (int i = 0;i < n;i++) {
				int left = 0;
				// B 배열을 탐색해야 하므로 이렇게 설정
				int right = m - 1;
				// 초기에는 찾은 쌍이 없으니 0
				int idx = 0;
				
				while (left <= right) {
					int mid = left + ((right - left) / 2);
					// 대상이 되는 값보다 작으면 쌍의 개수 업데이트를 진행하는데,
					// 이때 idx가 mid가 아니고 1이 더해지는 이유는 인덱스가 0부터 시작하기 때문이다.
					if (B[mid] < A[i]) {
						idx = mid + 1;
						left = mid + 1;
					} else {
						right = mid - 1;
					}
				}
				result += idx;
			}
			bw.write(result + "\n");
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
}