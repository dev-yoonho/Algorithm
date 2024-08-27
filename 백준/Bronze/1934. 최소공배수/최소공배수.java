import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		// 테스트 케이스의 개수 t
		int t = Integer.parseInt(br.readLine());
		
		for (int tc = 0;tc < t;tc++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());
			bw.write(lcm(A, B) + "\n");
		}
		bw.flush();
		
		br.close();
		bw.close();
	}

	static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}

	static int gcd(int a, int b) {
		while (b > 0) {
			int temp = a;
			a = b;
			b = temp % b;
		}
		return a;
	}
}