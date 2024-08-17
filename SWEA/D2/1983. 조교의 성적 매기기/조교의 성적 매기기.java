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
			// 학생 수 n, 학점을 알고 싶은 학생의 번호 k
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
			
			// 학생 배열(학생 번호, 총점)
			double[][] student = new double[n][2];
			for (int i = 0;i < n;i++) {
				student[i][0] = i + 1;
				st = new StringTokenizer(br.readLine());
				student[i][1] = Double.parseDouble(st.nextToken()) * 0.35 + 
							  	Double.parseDouble(st.nextToken()) * 0.45 +
							  	Double.parseDouble(st.nextToken()) * 0.2;
			}
			
			// 동점 가능 명 수
			int equalRank = n / 10;
			
			// 학생 배열을 정렬해서 어떤 평점을 부여할지 준비
			Arrays.sort(student, new Comparator<double[]>() {
				
				@Override
				public int compare(double[] o1, double[] o2) {
					return Double.compare(o2[1], o1[1]);
				}
			});
			
			int idx = -1;
			
			for (int i = 0;i < n;i++) {
				if (student[i][0] == k) {
					idx = i;
					break;
				}
			}
			
//			for (double[] person:student) {
//				System.out.println(Arrays.toString(person));
//			}
//			
//			System.out.println(idx);

			
			String[] grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D+"};
			
			int index =  idx / equalRank;
			
			bw.write(String.format("#%d %s\n", tc, 
									grade[index]));
		}
		
		
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}