import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 테스트 케이스의 개수 입력
		int t = Integer.parseInt(br.readLine());
		// 테스트 케이스 실행
		for (int i = 1;i < t + 1;i++) {
			// 숫자를 입력할 배열 생성, n 은 배열의 크기
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int[n][n];
			
			int num = 1;
			int top = 0, bottom = arr.length - 1;
			int left = 0, right = arr[0].length - 1;
			
			while (top <= bottom && left <= right) {
				for (int j = left;j <= right;j++) {
					arr[top][j] = num++;
				}
				top++;
				
				for (int j = top;j <= bottom;j++) {
					arr[j][right] = num++;
				}
				right--;
				
				if (top <= bottom) {
					for (int j = right;j >= left;j--) {
						arr[bottom][j] = num++;
					}
				}
				bottom--;
				
				if (left <= right) {
					for (int j = bottom;j >= top;j--) {
						arr[j][left] = num++;
					}
				}
				left++;
			}
			bw.write(String.format("#%d\n", i));
			for (int j = 0;j < arr.length;j++) {
				for (int k = 0;k < arr[0].length;k++) {
					bw.write(arr[j][k] + " ");
				}
				bw.write("\n");
			}
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
}