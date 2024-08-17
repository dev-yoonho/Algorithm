import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 테스트 케이스의 개수 t
		int t = Integer.parseInt(br.readLine());
		
		// 테스트 케이스 순회 시작
		for (int tc = 1;tc <= t;tc++) {
			// 거스름돈 n
			int n = Integer.parseInt(br.readLine());
			
			// 돈통 배열
			int[] change = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
			
			bw.write("#" + tc + "\n");
			
			for (int i = 0;i < change.length;i++) {
				if (n >= change[i]) {
					bw.write(n / change[i] + " ");
					n %= change[i];
				} else {
					bw.write(0 + " ");
				}
			}
			bw.write("\n");
		}
		
		
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}