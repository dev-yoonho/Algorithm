import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		// 입력 받을 준비
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 테스트 케이스 개수
		int t = 10;
		
		for (int i = 1;i < t + 1;i++) {
			// 건물의 개수
			int n = Integer.parseInt(br.readLine());
			// 1차원 배열 입력
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] numList = new int[n];
			for (int j = 0;j < n;j++) {
				numList[j] = Integer.parseInt(st.nextToken());
			}
			
			// 조망권 확보 세대 수 
			int result = 0;
			
			for (int k = 2;k < n - 2;k++) {
				if (numList[k] <= numList[k + 1] || numList[k] <= numList[k + 2] ||
					numList[k] <= numList[k - 1] || numList[k] <= numList[k - 2]) {
					continue;
				}
				int[] temp = {numList[k] - numList[k + 1], numList[k] - numList[k + 2],
							  numList[k] - numList[k - 1], numList[k] - numList[k - 2]};
				Arrays.sort(temp);
				result += temp[0];
			}
			System.out.println(String.format("#%d %d", i, result));
		}
	}
}