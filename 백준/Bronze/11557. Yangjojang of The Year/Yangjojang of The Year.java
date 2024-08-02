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
		
		int t = Integer.parseInt(br.readLine());
		
		int max = 0;
		String result = null;
		for (int i = 0;i < t;i++) {
			int n = Integer.parseInt(br.readLine());
			for (int j = 0;j < n;j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String name = st.nextToken();
				int quantity = Integer.parseInt(st.nextToken());
				if (max < quantity) {
					max = quantity;
					result = name;
				}
			}
			bw.write(result + "\n");
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
}