import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		// 정수 n 입력
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 1;i <= n;i++) {
			String check = i + "";
			String number = "";
			if (check.indexOf("3") == -1 && 
				check.indexOf("6") == -1 && 
				check.indexOf("9") == -1 ) {
				number = check;
			} else {
				for (int j = 0;j < (check.length() - check.replace("3", "").replace("6", "").replace("9", "").length());j++) {
					number += "-";
				}
			}
			
			bw.write(number + " ");
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}