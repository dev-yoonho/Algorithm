import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 테스트 케이스의 개수 t
		int t = Integer.parseInt(br.readLine());
		// 테스트 케이스 순회 시작
		for (int tc = 1; tc <= t; tc++) {
			StringBuilder initMemory = new StringBuilder(br.readLine());
			int n = initMemory.length();
			StringBuilder curMemory = new StringBuilder(repeatChar('0', n));
			
			int cnt = 0;
			
			for (int i = 0; i < n; i++) {
				if (initMemory.toString().equals(curMemory.toString())) break;
				if (initMemory.charAt(i) != curMemory.charAt(i)) {
					if (curMemory.charAt(i) == '0') {
						curMemory.setLength(i);
						curMemory.append(repeatChar('1', n - i));
						cnt++;
					} else if (curMemory.charAt(i) == '1') {
						curMemory.setLength(i);
						curMemory.append(repeatChar('0', n - i));
						cnt++;
					}
				}
			}
			bw.write(String.format("#%d %d\n", tc, cnt));
		}
		bw.flush();
		
		br.close();
		bw.close();
	}

	// Java 8 호환 반복 문자열 생성 메서드
	private static String repeatChar(char c, int count) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < count; i++) {
			sb.append(c);
		}
		return sb.toString();
	}
}