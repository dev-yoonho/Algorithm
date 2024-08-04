import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		 int number = Integer.parseInt(br.readLine());
		 while (number != 0) {
			 int left = 1;
			 int right = 50;
			 
			 while (left <= right) {
				 int mid = left + ((right - left) / 2);
				 
				 if (mid == number) {
					 bw.write(mid + " ");
					 break;
				 } else if (mid < number) {
					 bw.write(mid + " ");
					 left = mid + 1;
				 } else {
					 bw.write(mid + " ");
					 right = mid - 1;
				 }
			 }
			 bw.write("\n");
			 number = Integer.parseInt(br.readLine());
		 }
		 bw.flush();
		 
		 br.close();
		 bw.close();
	}
}