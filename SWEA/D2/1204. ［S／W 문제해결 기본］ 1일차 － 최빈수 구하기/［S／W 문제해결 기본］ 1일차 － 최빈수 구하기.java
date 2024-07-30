import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 테스트 케이스 개수 입력
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0;i < t;i++) {
			// 테스트 케이스 번호
			int number = Integer.parseInt(br.readLine());
			// 점수 배열 입력 받기
			int[] nums = new int[1000];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0;j < 1000;j++) {
				nums[j] = Integer.parseInt(st.nextToken());
			}
			// 최대 값 구하기
			int max = Integer.MIN_VALUE;
			for (int j:nums) {
				max = Math.max(max, j);
			}
			// 빈도 배열 count 생성 및 값 입력
			int[] count = new int[max + 1];
			for (int j = 0;j < 1000;j++) {
				count[nums[j]]++;
			}
			// 빈도 배열을 순회하며 가장 큰 값의 인덱스를 탐색. 
			// 중복되는 빈도가 있을 때는 가장 큰 값을 선택해야 하므로 같거나 큰 값일때 최대값 교체
			int maxCount = count[0];
			int maxCountIdx = 0;
			for (int j = 1;j < max + 1;j++) {
				if (count[j] >= maxCount) {
					maxCount = count[j];
					maxCountIdx = j;
				}
			}
			System.out.println(String.format("#%d %d", number, maxCountIdx));
		}
		
	}
}