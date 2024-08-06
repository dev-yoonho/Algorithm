import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1;i < n;i++) {
			System.out.print(" ".repeat(n - i));
			System.out.print("*");
			if (i != 1) {
				System.out.print(" ".repeat(2 * (i - 1) - 1));
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("*".repeat(1 + (n - 1) * 2));
		
		sc.close();
	}
}