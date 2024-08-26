import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력의 크기 n
		long n = sc.nextLong();
		
		System.out.println(n * (n - 1) * (n - 2) / 6);
		System.out.println(3);
	}
}