import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		// 학생 수 n
		int n = Integer.parseInt(br.readLine());
		
		// 학생 배열 student
		Object[][] student = new Object[n][4];
		
		// 배열 채우기
		for (int i = 0;i < n;i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int kor = Integer.parseInt(st.nextToken()), eng = Integer.parseInt(st.nextToken()), math = Integer.parseInt(st.nextToken());
			student[i][0] = name;
			student[i][1] = kor; 
			student[i][2] = eng;
			student[i][3] = math;
		}
		
		// Array.sort 오버라이딩(국어 - 영어 - 수학 - 이름
		Arrays.sort(student, new Comparator<Object[]>() {
			@Override
			public int compare(Object[] o1, Object[] o2) {
				Integer kor1 = (Integer) o1[1];
				Integer kor2 = (Integer) o2[1];
				Integer eng1 = (Integer) o1[2];
				Integer eng2 = (Integer) o2[2];
				Integer mth1 = (Integer) o1[3];
				Integer mth2 = (Integer) o2[3];
				String name1 = (String) o1[0];
				String name2 = (String) o2[0];
				if (!kor1.equals(kor2)) {
					return kor2.compareTo(kor1);
				} else if (!eng1.equals(eng2)) {
					return eng1.compareTo(eng2);
				} else if (!mth1.equals(mth2)) {
					return mth2.compareTo(mth1);
				} else {
					return name1.compareTo(name2);
				}
			}
		});
		
		
		for (Object[] o:student) {
			System.out.println(o[0]);
		}
	}
}