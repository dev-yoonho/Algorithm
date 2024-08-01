import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 1;i <= t;i++) {
			String str = br.readLine();
			int isPalindrome = checkString(str) ? 1:0;
			bw.write(String.format("#%d %d\n", i, isPalindrome));
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}

	static boolean checkString(String str) {
		for (int i = 0;i < str.length();i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}