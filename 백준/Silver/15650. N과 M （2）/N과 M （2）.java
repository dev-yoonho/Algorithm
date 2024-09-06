import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int[] arr;
	static int arrLength;
	static List<String> list;
	static int depth;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt();
		
		arrLength = n;
		depth = m;
		arr = new int[arrLength];
		list = new ArrayList<>();
		
		for (int i = 1;i <= arrLength;i++) {
			arr[i - 1] = i;
		}
		
		combination(0, 0, "");
		
		for (String str:list) {
			System.out.println(str);
		}
	}

	static void combination(int index, int count, String string) {
		// 기저조건
		if (count == depth) {
			list.add(string.trim());
			return;
		}
		// 재귀부분
		for (int i = index;i < arrLength;i++) {
			combination(i + 1, count + 1, string + arr[i] + " ");
		}
	}
}