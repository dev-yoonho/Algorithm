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
			int n = sc.nextInt();
			
			List<Integer> arr = new ArrayList<>();
			for (int i = 0;i < 10;i++) {
				arr.add(0);
			} 
			
			int i = 1;
			
			while (true) {
				String check = String.valueOf(n * i);
				for (int j = 0;j < String.valueOf(check).length();j++) {
					arr.set(Character.getNumericValue(check.charAt(j)), 1);
				}
				i++;
				if (arr.indexOf(0) < 0) break;
			}
			bw.write(String.format("#%d %d\n", tc, n * (i - 1)));
		}
		bw.flush();
		
		sc.close();
		bw.close();
	}
}