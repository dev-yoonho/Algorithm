import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		// 테스트 케이스의 개수 t
		int t = Integer.parseInt(br.readLine());
		// 테스트 케이스 순회 시작
		for (int tc = 1;tc <= t;tc++) {
			// 하나의 정수 n
			int n = Integer.parseInt(br.readLine());
			// 정수 배열 nums
			int[] nums = new int[n];
			st = new StringTokenizer(br.readLine());
			for (int i = 0;i < n;i++) {
				nums[i] = Integer.parseInt(st.nextToken());
			}
			bw.write(String.format("#%d %d\n", tc, monotonic(nums, n)));
		}
		bw.flush();
		
		br.close();
		bw.close();
	}

	static int monotonic(int[] nums, int length) {
		int[] monotonCheck = new int[length];
		int idx = 0;
		for (int i = 0;i < length;i++) {
			outer:
				for (int j = i + 1;j < length;j++) {
				char[] temp = String.valueOf(nums[i] * nums[j]).toCharArray();
				for (int k = 0;k < temp.length - 1;k++) {
					if (temp[k] > temp[k + 1]) 
						continue outer;
				}
				monotonCheck[idx++] = nums[i] * nums[j];
			}
		}
		if (monotonCheck[0] == 0) {
			return -1;
		}
		int max = monotonCheck[0];
		for (int num:monotonCheck) {
			max = Math.max(max, num);
		}
		return max;
	}
}