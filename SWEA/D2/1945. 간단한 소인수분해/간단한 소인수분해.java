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
			
			bw.write("#" + tc + " ");
			int[] nums = {2, 3, 5, 7, 11};
			for (int num:nums) {
				int nCopy = n;
				int cnt = 0;
				while (nCopy % num == 0) {
					nCopy /= num;
					cnt++;
				}
				bw.write(cnt + " ");
			}
			bw.write("\n");
		}
		bw.flush();
		
		sc.close();
		bw.close();
	}
}