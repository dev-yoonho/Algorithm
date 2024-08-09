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
			String s = sc.next();
			
			int i;
			
			for (i = 1;i < 15;i++) {
				if (s.substring(0, i).equals(s.substring(i, i * 2))) break;
			}
			
			
			bw.write(String.format("#%d %d\n", tc, i));
		}
		bw.flush();
		
		sc.close();
		bw.close();
	}
}