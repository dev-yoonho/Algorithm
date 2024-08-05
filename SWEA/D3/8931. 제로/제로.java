import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 스택 생성
		Stack<Integer> stck;
		
		// 테스트 케이스 개수 t
		int t = Integer.parseInt(br.readLine());
		
		// 테스트 케이스 돌기 시작
		for (int tc = 1;tc <= t;tc++) {
			stck = new Stack<>();
			// 수를 부르는 횟수 k
			int k = Integer.parseInt(br.readLine());
			for (int i = 0;i < k;i++) {
				int number = Integer.parseInt(br.readLine());
				if (number != 0) {
					stck.push(number);
				} else {
					stck.pop();
				}
			}
			int sum = 0;
			if (!(stck.isEmpty())) {
				for (int n:stck) {
					sum += n;
				}
			}
			
			bw.write(String.format("#%d %d\n", tc, sum));
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
}