import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
			System.out.println(String.format("#%d %d", i, getMaxNum(numList)));
		}
	}
	
	private static int getMaxNum(int[] arr) {
		for (int i = arr.length - 1;i > 0;i--) {
			for (int j = 0;j < i;j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[arr.length - 1];
	}
}