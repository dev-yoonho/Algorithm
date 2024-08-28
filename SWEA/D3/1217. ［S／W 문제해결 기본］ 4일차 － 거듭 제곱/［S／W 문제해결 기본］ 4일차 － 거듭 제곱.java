import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = 10;
		
		for (int tc = 1; tc <= t;tc++) {
			int tNum = sc.nextInt();
			int n = sc.nextInt(), k = sc.nextInt();
			
			System.out.printf("#%d %d\n", tNum, pow(n, k));
		}

	}

	static int pow(int n, int k) {
		// 기저조건
		if (k == 1) return n;
		// 재귀부분
		if (k % 2 == 0) {
			return pow(n, k / 2) * pow(n, k / 2);
		} else {
			return pow(n, (k - 1) / 2) * pow(n, (k - 1) / 2) * n;
		}	
	}
}