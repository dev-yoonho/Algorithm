import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();
		
		int coke = sc.nextInt();
		int cidar = sc.nextInt();

		System.out.println(Math.min(one, Math.min(two, three)) + Math.min(cidar, coke) - 50);
	}
}