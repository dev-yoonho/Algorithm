import java.util.*;

public class Main {
    static int[] arr;
    static int N;
    static Set<Integer> set;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.next();
        int x_num = Integer.parseInt(x);

        N = x.length();
        arr = new int[N];
        visited = new boolean[N];
        set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            arr[i] = x.charAt(i) - '0';
        }

        findNum(0, "");

        List<Integer> temp = new ArrayList<>(set);
        Collections.sort(temp);

        boolean existResult = false;

        for (int num : temp) {
            if (x_num < num) {
                existResult = true;
                System.out.println(num);
                break;
            }
        }

        if (!existResult) System.out.println(0);
    }

    static void findNum(int depth, String number) {
        // 기저조건
        if (depth == N) {
            set.add(Integer.parseInt(number));
            return;
        }
        // 재귀조건
        for (int i = 0;i < N;i++) {
            if (visited[i]) continue;
            visited[i] = true;
            findNum(depth + 1, number + arr[i]);
            visited[i] = false;
        }
    }
}