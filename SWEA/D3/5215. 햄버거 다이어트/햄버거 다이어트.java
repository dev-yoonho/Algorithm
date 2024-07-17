import java.util.Scanner;

class Solution {
	static int T;
	static int N, L;
	static int[][] items;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for (int tc = 1;tc <= T;tc++) {
			N = sc.nextInt();
			L = sc.nextInt();
			
			items = new int[N + 1][2];
			for (int i = 1;i <= N;i++) {
				items[i][1] = sc.nextInt();
				items[i][0] = sc.nextInt();
			}
			
			int[][] dp = new int[N + 1][L + 1];
			
			for (int i = 1;i <= N;i++) {
				for (int j = 1;j <= L;j++) {
					if (items[i][0] > j) {
						dp[i][j] = dp[i-1][j];
					} else {
						dp[i][j] = Math.max(dp[i-1][j], dp[i - 1][j - items[i][0]] + items[i][1]);
					}
				}
			}
			System.out.printf("#%d %d\n", tc, dp[N][L]);
		}
		sc.close();
	}
}