import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = sc.nextInt();
		
		for (int tc = 1;tc <= t;tc++) {
			int p = sc.nextInt(), q = sc.nextInt(), r = sc.nextInt(), s = sc.nextInt(), w = sc.nextInt();
			int A = w * p;
			int B = w <= r ? q: (w - r) * s + q;
			
			bw.write(String.format("#%d %d\n", tc, Math.min(A, B)));
		}
		bw.flush();
		
		sc.close();
		bw.close();
	}
}