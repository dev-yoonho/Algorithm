import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
	
		// 참가자의 수 n
		int n = Integer.parseInt(br.readLine());
		
		// 티셔츠 사이즈별 신청자의 수
		int[] size = new int[6];
		st = new StringTokenizer(br.readLine());
		for (int i = 0;i < 6;i++) {
			size[i] = Integer.parseInt(st.nextToken());
		}
		
		// 티셔츠의 한 묶음당 수 t, 펜의 한 묶음당 수 p
		st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken()), p = Integer.parseInt(st.nextToken());
		
		int tShirts = 0;
		for (int i = 0;i < 6;i++) {
			tShirts += Math.ceil((double) size[i] / t);
		}
		bw.write(tShirts + "\n");
		bw.write(n / p + " " + n % p + "\n");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}