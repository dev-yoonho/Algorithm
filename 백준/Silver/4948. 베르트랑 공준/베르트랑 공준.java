import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	static boolean[] isPrime;
	static void isPrimeFilter(int n) {
		isPrime = new boolean[n + 1];
		
		for (int i = 2;i < n + 1;i++) {
			isPrime[i] = true; 
		}
		
		for (int i = 2;i < Math.sqrt(n);i++) {
			if (isPrime[i]) {
				for (int j = i * i;j <= n;j += i) {
					isPrime[j] = false;
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		isPrimeFilter(123456 * 2);
		
		int caseNumber = Integer.parseInt(br.readLine());
		while (caseNumber != 0) {
			int cnt = 0;
			for (int i = caseNumber + 1;i <= caseNumber * 2;i++) {
				if (isPrime[i]) cnt++;
			}
			bw.write(cnt + "");
			caseNumber = Integer.parseInt(br.readLine());
			if (caseNumber != 0) bw.write("\n");
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
}