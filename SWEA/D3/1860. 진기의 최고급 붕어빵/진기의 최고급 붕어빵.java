import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		for (int tc = 1;tc <= t;tc++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()); 
			int m = Integer.parseInt(st.nextToken()); 
			int k = Integer.parseInt(st.nextToken()); 
			
			st = new StringTokenizer(br.readLine());
			int[] client = new int[n];
			for (int i = 0;i < n;i++) {
				client[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(client);
			
			bw.write(String.format("#%d %s\n", tc, checkPossible(client, n, m, k)));
		}
		bw.flush();
		
		br.close();
		bw.close();
	}

	static String checkPossible(int[] client, int n, int m, int k) {
		for (int i = 1;i < n + 1;i++) {
			if (client[i - 1] / m * k < i) {
				return "Impossible";
			}
		}
		return "Possible";
	}
}