import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 1;i < t + 1;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] numList = new int[10];
			for (int j = 0;j < 10;j++) {
				numList[j] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(numList);
			
			double sum = 0;
			for (int k = 1;k < 9;k++) {
				sum += numList[k];
			}
			System.out.println(String.format("#%d %d", i, (int) Math.round(sum / 8)));
		}
	}
}