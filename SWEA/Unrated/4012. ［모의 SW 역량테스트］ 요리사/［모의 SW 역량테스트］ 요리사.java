import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
	
	static int[] number; // 식재료 
	static int N, R; // 식재료 개수, 몇 개를 선택할 것인지
	static int[][] board; // 시너지 배열
	static int[] food; // 첫번째 음식
	static boolean[] used; // 이미 사용한 식재료
	static int minDifference; // 최소 시너지 차이
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		// 테스트 케이스의 개수 t
		int t = Integer.parseInt(br.readLine());
		
		// 테스트 케이스 순회 시작
		for (int tc = 1;tc <= t;tc++) {
			// 식재료의 수 N
			N = Integer.parseInt(br.readLine());
			R = N / 2;
			
			// 시너지 배열 board
			board = new int[N][N];
			
			for (int i = 0;i < N;i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0;j < N;j++) {
					board[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			number = new int[N];
			for (int i = 0;i < N;i++) {
				number[i] = i;
			}
			used = new boolean[N];
			food = new int[R];
			
			minDifference = Integer.MAX_VALUE; // 최소 시너지 차이 초기화
			
			combination(0, 0);
			
			bw.write(String.format("#%d %d\n", tc, minDifference));
		}
		bw.flush();
		
		br.close();
		bw.close();
	}

	static void combination(int idx, int fidx) {
		// 기저조건
		if (fidx == R) {
			calculateDifference();
			return;
		}
		
		if (idx == N) return;
		
		// 재귀부분
		food[fidx] = number[idx];
		used[idx] = true;
		combination(idx + 1, fidx + 1);
		
		used[idx] = false;
		combination(idx + 1, fidx);
	}

	static void calculateDifference() {
		int[] otherFood = new int[R];
        int idx = 0;
        for (int i = 0; i < N; i++) {
            if (!used[i]) {
                otherFood[idx++] = number[i];
            }
        }
        
        int foodSynergy = 0;
        int otherFoodSynergy = 0;
        
        for (int i = 0; i < R; i++) {
            for (int j = i + 1; j < R; j++) {
                foodSynergy += board[food[i]][food[j]] + board[food[j]][food[i]];
                otherFoodSynergy += board[otherFood[i]][otherFood[j]] + board[otherFood[j]][otherFood[i]];
            }
        }
        
        int difference = Math.abs(foodSynergy - otherFoodSynergy);
        minDifference = Math.min(minDifference, difference);
		
	}
}