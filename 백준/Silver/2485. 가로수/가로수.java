import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 이미 심어져 있는 가로수의 수 n
		int n = Integer.parseInt(br.readLine());
		
		// 각 줄마다 심어져 있는 가로수의 위치 배열
		int[] treeLocation = new int[n];
		
		// 나무의 위치 배열에 입력
		for (int i = 0;i < n;i++) {
			treeLocation[i] = Integer.parseInt(br.readLine());
		}
		
		int[] gaps = new int[n - 1];
		
		for (int i = 0;i < n - 1;i++) {
			gaps[i] = treeLocation[i + 1] - treeLocation[i];
		}
		
		int diff = gaps[0];
		for (int i = 0;i < gaps.length;i++) {
			diff = gcd(diff, gaps[i]);
		}
		
		int cnt = 0;
		for (int i = 0;i < gaps.length;i++) {
			cnt += gaps[i] / diff - 1;
		}
		
		bw.write(cnt + "");
		
		bw.flush();
		
		br.close();
		bw.close();
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