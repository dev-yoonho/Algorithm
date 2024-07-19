import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine().trim());
		
		for (int i = 0;i < t;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			int cnt = 0;
			
			for (int x = 1;x <= a; x++) {
				for (int y = 1;y <= b;y++) {
					int xmody = x % y;
					for (int z = 1;z <= c;z++) {
						if (xmody == y %z && y % z == z % x) {
							cnt++;
						}
					}
				}
			}
			System.out.println(cnt);
		}
	}
}