import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
			// 정수 n, m 입력
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			if ((m & (1 << n) - 1) == (1 << n) - 1) {
				bw.write(String.format("#%d ON\n", tc));
			} else {
				bw.write(String.format("#%d OFF\n", tc));
			}
			
		}
		bw.flush();
		
		br.close();
		bw.close();
	}

	static String checkBitCondition(int n, int m) {
		// m을 2진수로 바꾼 수를 거꾸로 한 문자열 binaryNum
		String binaryNum = "";
		while (m >= 1) {
			binaryNum += (m % 2);
			m /= 2;
		}
		
		for (int i = 0;i < n;i++) {
			if (binaryNum.charAt(i) != '1') {
				return "OFF";
			}
		}
		return "ON";
	}
}