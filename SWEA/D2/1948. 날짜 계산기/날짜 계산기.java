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
		
		// 날짜 배열
		int[] dayNum = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// 테스트 케이스의 개수 t
		int t = Integer.parseInt(br.readLine());
		// 테스트 케이스 순회 시작
		for (int tc = 1;tc <= t;tc++) {
			st = new StringTokenizer(br.readLine());
			// 시작 월 startMon 일 startDay,
			// 끝나는 월 endMon 일 endDay 
			// => 끝나는 월  일 - 시작 월 일 = 답
			int startMon = Integer.parseInt(st.nextToken()), startDay = Integer.parseInt(st.nextToken());
			int endMon = Integer.parseInt(st.nextToken()), endDay = Integer.parseInt(st.nextToken());
			
			int result = 0;
			if (startMon == endMon) {
				result = endDay - startDay + 1;
			} else {
				result += dayNum[startMon - 1] - startDay +1 + endDay;
				for (int i = startMon;i < endMon - 1;i++) {
					result += dayNum[i];
				}
			} 
			bw.write(String.format("#%d %d\n", tc, result));
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
}