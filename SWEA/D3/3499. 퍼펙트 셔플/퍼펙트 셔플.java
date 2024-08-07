import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 테스트 케이스 수 t
		int t = Integer.parseInt(br.readLine());
		for (int tc = 1;tc <= t;tc++) {
			// 카드 큐
			Queue<String> card = new LinkedList<>();
			Queue<String> card2 = new LinkedList<>();
			// 카드 개수 n
			int n = Integer.parseInt(br.readLine());
			// 카드 큐에 카드 넣기
			StringTokenizer st = new StringTokenizer(br.readLine());
			if (n % 2 == 0) {
				for (int i = 0;i < n;i++) {
					if (i < n/2) {
						card.add(st.nextToken());
					} else {
						card2.add(st.nextToken());
					}
				}
			} else {
				for (int i = 0;i < n;i++) {
					if (i < n / 2 + 1) {
						card.add(st.nextToken());
					} else {
						card2.add(st.nextToken());
					}
				}
			}
			bw.write("#" + tc + " ");
			while (!card.isEmpty() || !card2.isEmpty()) {
				bw.write(card.poll() + " ");
				try {
					bw.write(card2.remove() + " ");
				} catch (Exception e) {
					break;
				}
			}
			bw.write("\n");
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
}