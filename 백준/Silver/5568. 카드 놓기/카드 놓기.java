import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    static int[] card;
    static int N, k;
    static Set<String> makeNum;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 카드의 개수 n
        N = sc.nextInt();

        // 선택할 카드의 개수 k
        k = sc.nextInt();

        card = new int[N];
        visited = new boolean[N];
        makeNum = new HashSet<>();

        for (int i = 0; i < N; i++) {
            card[i] = sc.nextInt();
        }

        makeNumberWithBacktrack(0, "");

        System.out.println(makeNum.size());
    }

    static void makeNumberWithBacktrack(int index, String number) {
        // 기저조건
        if (index == k) {
            makeNum.add(number);
            return;
        }
        // 재귀부분
        for (int i = 0; i < N; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            makeNumberWithBacktrack(index + 1, number + card[i]);
            visited[i] = false;
        }
    }
}