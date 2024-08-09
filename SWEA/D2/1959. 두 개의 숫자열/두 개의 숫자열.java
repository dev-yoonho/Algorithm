import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = sc.nextInt();
		
		for (int tc = 1;tc <= t;tc++) {
			int n = sc.nextInt(), m = sc.nextInt();
			
			List<Integer> A = new ArrayList<>();
			List<Integer> B = new ArrayList<>();
			
			for (int i = 0;i < n;i++) {
				A.add(sc.nextInt());
			}
			
			for (int i = 0;i < m;i++) {
				B.add(sc.nextInt());
			}
			
			int max = Integer.MIN_VALUE;
			
			if (n > m) {
				for (int i = 0;i < n - m + 1;i++) {
					int temp = 0;
					for (int j = 0;j < m;j++) {
						temp += A.get(j) * B.get(j);
					}
					max = Math.max(max, temp);
					A.remove(0);
				}
			} else {
				for (int i = 0;i < m - n + 1;i++) {
					int temp = 0;
					for (int j = 0;j < n;j++) {
						temp += A.get(j) * B.get(j);
					}
					max = Math.max(max, temp);
					B.remove(0);
				}
			}
			bw.write(String.format("#%d %d\n", tc, max));
		}
		bw.flush();
		
		sc.close();
		bw.close();
	}
}