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
			// 명령어 수 n
			int n = Integer.parseInt(br.readLine());
			// 이동거리 dist, RC카의 속도 rc
			int dist = 0, rc = 0;
			// 명령어 순회 시작
			for (int i = 0;i < n;i++) {
				st = new StringTokenizer(br.readLine());
				int command = Integer.parseInt(st.nextToken());
				int acc = st.hasMoreTokens() ? Integer.parseInt(st.nextToken()):0;
				rc += command == 1 ? acc:-1 * acc;
				rc = rc < 0 ? 0:rc;
				dist += rc;
			}
			bw.write(String.format("#%d %d\n", tc, dist));
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
}