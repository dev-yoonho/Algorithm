import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 테스트 케이스는 10개
		for (int t = 0;t < 10;t++) {
			// 데이터 큐
			Queue<Integer> data = new LinkedList<>();
			// 테스트 케이스 번호
			int tc = Integer.parseInt(br.readLine());
			// 큐에 데이터 입력
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0;i < 8;i++) {
				data.add(Integer.parseInt(st.nextToken()));
			}
			outer:
				while (true) {
				// 이게 1 사이클
				// 1부터 5까지 하나씩 증가하면서 빼주기
				for (int i = 1;i <= 5;i++) {
					// 감소하고 맨 뒤로 보낼 맨 앞의 데이터(였던 것)
					int head = data.peek() - i;
					// head가 0이거나 0보다 작으면 사이클 종료
					if (head <= 0) {
						break outer;
					}
					data.remove();
					data.add(head);
				}
				
			}
			// 맨 앞 데이터를 빼고 맨 뒤에 0 추가
			data.remove();
			data.add(0);
			// 암호 출력
			bw.write("#" + tc + " ");
			for (int i:data) {
				bw.write(i + " ");
			}
			bw.write("\n");
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
}