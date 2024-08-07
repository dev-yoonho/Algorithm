import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 테스트 케이스 개수 t
		int t = Integer.parseInt(br.readLine());
		
		// 테스트 케이스 순회 시작
		for (int tc = 1;tc <= t;tc++) {
			// 각 카드 세트의 카드 개수 n, m
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
			
			// 카드 배열 생성 및 채우기
			int[] card1 = new int[n], card2 = new int[m];
			// n
			for (int i = 0;i < n;i++) {
				card1[i] = i + 1;
			}
			// m
			for (int i = 0;i < m;i++) {
				card2[i] = i + 1;
			}
			// 숫자의 합 카운팅 배열
			int[] count = new int[n + m + 1];
			// 카운팅
			for (int i = 0;i < n;i++) {
				for (int j = 0;j < m;j++) {
					count[card1[i] + card2[j]]++;
				}
			}
			// 가장 많이 등장하는 인덱스 오름차순으로 출력하기
			// 가장 많이 등장하는 값 초기값
			int max = Integer.MIN_VALUE;
			// 가장 많이 등장하는 값을 넣을 큐 result
			Queue<Integer> result = new LinkedList<>();
			// 카운팅 배열을 순회하며 값이 이미 들어있는 값보다 크면 큐의 모든 요소를 지우고 현재 인덱스를 삽입
			// 만약 값이 이미 들어있는 값과 동일하면 현재 인덱스를 삽입
			for (int i = 0;i < count.length;i++) {
				if (max < count[i]) {
					max = count[i];
					result.clear();
					result.add(i);
				} else if (max == count[i]) {
					result.add(i);
				}
			}
			bw.write("#" + tc+ " ");
			for (int i:result) {
				bw.write(i + " ");
			}
			bw.write("\n");
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
}