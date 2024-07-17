import java.util.Scanner;

class Solution {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스의 개수 t
		int t = sc.nextInt();
		// 퍼즐 배열 
		int[][] puzzle = new int[9][9];
		
		for (int tc = 1;tc <= t;tc++) {
			//퍼즐 입력
			for (int i = 0;i < 9;i++) {
				for (int j = 0;j < 9;j++) {
					puzzle[i][j] = sc.nextInt();
				}
			}
			
			boolean correct = true;
			// 가로 검증
			
			for (int i = 0;i < 9;i++) {
				int[] numCnt = new int[10];
				for (int j = 0;j < 9;j++) {
					numCnt[puzzle[i][j]]++;
					if (numCnt[puzzle[i][j]] == 2) {
						correct = false;
						break;
					}
				}
				if (!correct) {
					break;
				}
			}
			if (!correct) {
				System.out.printf("#%d 0\n", tc);
				continue;
			}
			// 세로 검증
			
			for (int i = 0;i < 9;i++) {
				int[] numCnt = new int[10];
				for (int j = 0;j < 9;j++) {
					numCnt[puzzle[j][i]]++;
					if (numCnt[puzzle[j][i]] == 2) {
						correct = false;
						break;
					}
				}
				if (!correct) {
					break;
				}
			}
			if (!correct) {
				System.out.printf("#%d 0\n", tc);
				continue;
			}
			
			// 격자 검증
			
			for (int i = 1;i <= 3;i++) {
				int sum = 0;
				for (int j = (i - 1) * 3;j < i * 3;j++) {
					for (int k = (i - 1) * 3;k < i * 3;k++) {
						sum += puzzle[j][k];
					}
				}
				if (sum != 45) {
					correct = false;
					break;
				}
			}
			if (!correct) {
				System.out.printf("#%d 0\n", tc);
				continue;
			}
			
			System.out.printf("#%d 1\n", tc);
			
		}
	}
}