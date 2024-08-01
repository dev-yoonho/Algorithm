import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 게임 횟수 x, 이긴 게임 수 y
		long x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
		// 승률 z
		long z = (long) ((100 * y) / x);
		
		if (z >= 99) {
			System.out.println(-1);
		} else {
			long left = 0;
			long right = 1000000000;
			long result = -1;
			
			while (left <= right) {
				long mid = left + ((right - left) / 2);
				long target = (long) (((y + mid) * 100L) / (x + mid));
				
				if (target <= z) {
					left = mid + 1;
					result = mid + 1;
				} else {
					right = mid - 1;
				}
			}
			System.out.println(result);
		}
		
	}
}