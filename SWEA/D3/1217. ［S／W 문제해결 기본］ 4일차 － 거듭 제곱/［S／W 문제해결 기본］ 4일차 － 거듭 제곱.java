import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int tc = 0;tc < 10;tc++) {
			// 테스트 케이스 번호 t
			int t = sc.nextInt();
			// 대상 숫자 n, 거듭제곱 횟수 m
			int n = sc.nextInt(), m = sc.nextInt();
			
			System.out.printf("#%d %d\n", t, pow(n, m));
		}
		sc.close();
	}

	static int pow(int n, int m) {
		if (m > 0) {
			return n * pow(n, m - 1);
		} else {
			return 1;
		}
	}
}