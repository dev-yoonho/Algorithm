import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int t = 0;t < 10;t++) {
			// 테스트 케이스 번호입력
			int tc = Integer.parseInt(br.readLine());
			// 테스트 케이스 배열 생성
			char[][] board = new char[100][100];
			// 배열 채우기
			for (int i = 0;i < 100;i++) {
				board[i] = br.readLine().toCharArray();
			}
			// 최대 길이 초기화 
			int max = 1;
			// 행에서 찾기
			for (int r = 0;r < 100;r++) {
				// 행의 부분집합 탐색
				for (int i = 0;i < 99;i++) {
					for (int j = i + 1;j < 100;j++) {
						if (isPalindrome(Arrays.copyOfRange(board[r], i, j + 1))) {
							max = Math.max(max, j - i + 1);
						}
					}
				}
			}
			// 열에서 찾기
			for (int c = 0;c < 100;c++) {
				// 열을 배열로 전환
				char[] tempBoard = new char[100];
				for (int k = 0;k < 100;k++) {
					tempBoard[k] = board[k][c];
				}
				for (int i = 0;i < 99;i++) {
					for (int j = i + 1;j < 100;j++) {
						if (isPalindrome(Arrays.copyOfRange(tempBoard, i, j + 1))) {
							max = Math.max(max, j - i + 1);
						}
					}
				}
			}
			bw.write(String.format("#%d %d\n", tc, max));
		}
		bw.flush();
		
		br.close();
		bw.close();
	}

	static boolean isPalindrome(char[] arr) {
		int n = arr.length;
		int mid = arr.length / 2;
		
		if (n % 2 == 0) {
			int left = mid - 1;
			int right = mid;
			while (left >= 0 && right < n) {
				if (arr[left] != arr[right]) {
					return false;
				}
				left--;
				right++;
			}
			return true;
		}
		else {
			int left = mid - 1;
			int right = mid + 1;
			while (left >= 0 && right < n) {
				if (arr[left] != arr[right]) {
					return false;
				}
				left--;
				right++;
			}
			return true;
		}
	}
}