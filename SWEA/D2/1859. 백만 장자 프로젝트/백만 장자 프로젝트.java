import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Comparator;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		// 테스트 케이스의 개수 t
		int t = Integer.parseInt(br.readLine());
		// 테스트 케이스 순회시작
		for (int tc = 1;tc <= t;tc++) {
			int n = Integer.parseInt(br.readLine());
			// 매매가 배열 price 
			int[] price = new int[n];
			st = new StringTokenizer(br.readLine());
			for (int i = 0;i < n;i++) {
				price[i] = Integer.parseInt(st.nextToken());
			}
			// 최댓값 배열
			int[] max = new int[n];
			max[n - 1] = price[n - 1];
			for (int i = n - 2;i >= 0;i--) {
				max[i] = Math.max(price[i], max[i + 1]);
			}
			long sum = 0;
			for (int i = 0;i < n;i++) {
				sum += (max[i] - price[i]);
			}
			bw.write(String.format("#%d %d\n", tc, sum));
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
}