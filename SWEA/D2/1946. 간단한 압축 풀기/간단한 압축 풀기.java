import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
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
			// 알파벳과 숫자 쌍의 개수 n
			int n = Integer.parseInt(br.readLine());
			// 압축되었던 원본 문자열
			String zipString = "";
			
			for (int i = 0;i < n;i++) {
				st = new StringTokenizer(br.readLine());
				String alphabet = st.nextToken();
				int repeatNumber = Integer.parseInt(st.nextToken());
				
				for (int j = 0;j < repeatNumber;j++) {
					zipString += alphabet;
				}
			}
			
			bw.write("#" + tc + "\n");
			
			for (int i = 0;i <= zipString.length() / 10;i++) {
				if (i == zipString.length() / 10) {
					bw.write(zipString.substring(i * 10) + "\n");
					break;
				}
				bw.write(zipString.substring(i * 10, (i + 1) * 10) + "\n");
			}
		}
		
		
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}