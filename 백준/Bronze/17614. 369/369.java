import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		for (int i = 1;i <= n;i++) {
			cnt += (String.valueOf(i).chars().filter(c -> c == '3').count()
					+ String.valueOf(i).chars().filter(c -> c == '6').count()
					+ String.valueOf(i).chars().filter(c -> c == '9').count()
			);
		}
		System.out.println(cnt);
	}
}