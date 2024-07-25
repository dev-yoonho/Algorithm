import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		
        outer:
		for (int i = -999;i < 1000;i++) {
			for (int j = -999;j < 1000;j++) {
				if ((a * i + b * j == c) && (d * i + e *j == f)) {
					System.out.println(String.format("%d %d", i, j));
					break outer;
				}
			}
		}
		br.close();
	}
}