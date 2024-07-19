import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		for (int i = 1;i <= n;i++) {
			if (n % i == 0) {
				cnt++;
			}
		}
		
		int idx = 0;
		int[] nList = new int[cnt];
		for (int i = 1;i <= n;i++) {
			if (n % i == 0) {
				nList[idx++] = i;
			}
		}
		
		int result = nList.length >= k ? nList[k - 1]:0;
		
		System.out.println(result);
	}
}