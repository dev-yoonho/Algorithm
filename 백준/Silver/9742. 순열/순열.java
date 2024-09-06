import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static String testCase, result;
	static char[] arr;
	static boolean[] visited;
	static int index, cnt;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		String x;
		while ((x = br.readLine()) != null) {
			st = new StringTokenizer(x);
			testCase = st.nextToken();
			index = Integer.parseInt(st.nextToken());
			
			cnt = 0;
			arr = new char[testCase.length()];
			visited = new boolean[testCase.length()];
			
			permutation(0);
			
			result = cnt < index ? "No permutation" : result;
			bw.write(String.format("%s %d = %s\n", testCase, index, result));
			
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}

	static void permutation(int depth) {
		//기저조건
		if (depth == arr.length) {
			cnt++;
			if (cnt == index) result = String.valueOf(arr);
			return;
		}
		//재귀부분
		for (int i = 0;i < arr.length;i++) {
			if (visited[i]) continue;
			visited[i] = true;
			arr[depth] = testCase.charAt(i);
			permutation(depth + 1);
			visited[i] = false;
		}
	}
}