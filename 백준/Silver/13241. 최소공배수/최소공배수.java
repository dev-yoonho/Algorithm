import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong(), b = sc.nextLong();
		System.out.println(lcm(a, b));
		
		sc.close();
	}

	static long lcm(long a, long b) {
		return (a * b) / gcd(a, b);
	}

	static long gcd(long a, long b) {
		while (b > 0) {
			long temp = a;
			a = b;
			b = temp % b;
		}
		return a;
	}
}