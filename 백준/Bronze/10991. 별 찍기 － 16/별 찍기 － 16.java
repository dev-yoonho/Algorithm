import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0;i < n;i++) {
			System.out.print(" ".repeat(n - i - 1));
			System.out.print("* ".repeat(i + 1));
			System.out.println();
		}
		
		sc.close();
	}
}