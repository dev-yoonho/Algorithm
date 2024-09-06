import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int[] arr;
	static int arrLength;
	static boolean[] visited;
	static List<String> list;
	static int depth;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt();
		
		arrLength = n;
		depth = m;
		arr = new int[arrLength];
		visited = new boolean[arrLength];
		list = new ArrayList<>();
		
		
		for (int i = 1;i <= n;i++) {
			arr[i - 1] = i;
		}
		
		permutation(0, "");
		
		for (String str : list) {
			System.out.println(str);
		}
	}
	static void permutation(int index, String perm) {
		// 기저조건
		if (index == depth) {
			list.add(perm);
			return;
		}
		// 재귀부분
		for (int i = 0;i < arrLength;i++) {
			if (visited[i]) continue;
			visited[i] = true;
			permutation(index + 1, perm + arr[i] + " ");
			visited[i] = false;
		}
		
	}
}