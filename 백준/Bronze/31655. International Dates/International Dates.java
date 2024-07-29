import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int num1 = Integer.parseInt(str.substring(0, 2)); 
		int num2 = Integer.parseInt(str.substring(3, 5));
		
		if (num1 < 13 && num2 > 12) {
			System.out.println("US");
		} else if (num1 > 12 && num2 < 13) {
			System.out.println("EU");
		} else {
			System.out.println("either");
		}
	}
}