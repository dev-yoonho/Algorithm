import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	// 1학년부터 6학년까지 학생들이 묵을 방을 배정해야 함
	// 동성끼리만 배정해야 함
	// 한 방에는 같은 학년의 학생들을 배정해야 함
	// 한 방에 한 명만 배정하는 것도 가능
			
	// 한 방에 배정할 수 있는 최대 인원 수 k
	// 조건에 맞게 모든 학생을 배정하기 위해 필요한 방의 최소 개수를 구하는 프로그램을 작성
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// 수학여행에 참가하는 학생 수 n, 한 방에 배정할 수 있는 최대 인원 수 k
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken()); 
		
		// 학생들을 넣을 2차원 배열 student - [학년][성별] ex.[0][0] - 1학년 여성, [0][1] - 1학년 남성
		int[][] student = new int[6][2];
		
		for (int i = 0;i < n;i++) {
			// 학생의 성별 s, 학년 y
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
			student[y - 1][s]++;
		}
		
		// 방의 최소 개수 result
		int result = 0;

		for (int i = 0;i < 6;i++) {
			for (int j = 0;j < 2;j++) {
				result += (student[i][j] % k == 0 ? student[i][j] / k:student[i][j] / k + 1);
			}
		}
		System.out.println(result);
	}
}