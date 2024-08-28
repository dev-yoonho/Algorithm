import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static int[][] memo;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		// 행 n, 수의 순서 k
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()) - 1, k = Integer.parseInt(st.nextToken()) - 1;
		
		memo = new int[n + 1][k + 1];
		
		bw.write(calComb(n, k) + "\n");
		
		bw.flush();
		
		br.close();
		bw.close();
	}

	static int calComb(int n, int k) {
		if (k == 0 || k == n) return 1;
		if (memo[n][k] != 0) return memo[n][k];
		memo[n][k] = calComb(n - 1, k - 1) + calComb(n - 1, k);
		return memo[n][k];
	}
}