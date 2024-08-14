import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for (int tc = 1;tc <= 10;tc++) {
			// 트리가 갖는 총 정점의 수 n
			int n = Integer.parseInt(br.readLine());
			// 트리 배열 tree
			char[] tree = new char[n + 1];
			// n 줄에 걸쳐 각각의 정점 정보가 주어짐
			for (int i = 0;i < n;i++) {
				st = new StringTokenizer(br.readLine());
				tree[Integer.parseInt(st.nextToken())] = st.nextToken().charAt(0);
			}
			System.out.print("#" + tc + " ");
			inorder(tree, 1);
			System.out.println();
		}
	}

	private static void inorder(char[] tree, int root) {
		if (root >= tree.length || tree[root] == '0') {
			return;
		}
		inorder(tree, root * 2);
		System.out.print(tree[root]);
		inorder(tree, root * 2 + 1);
	}
}