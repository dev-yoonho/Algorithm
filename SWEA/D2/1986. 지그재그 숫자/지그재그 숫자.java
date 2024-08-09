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
			int n = sc.nextInt();
			int sum = 0;
			int num = 0;
			for (int i = 1;i <= n;i++) {
				sum += (num = i % 2 != 0 ? i:-1 * i); 
			}
			bw.write(String.format("#%d %d\n", tc, sum));
		}
		bw.flush();
		
		sc.close();
		bw.close();
	}
}