import java.util.Scanner;

public class Solution {
    static int N, L; // 재료의 수와 제한 칼로리
    static int[] cals;
    static int[] scores;
    static int ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스의 개수 t
        int t = sc.nextInt();

        for (int tc = 1; tc <= t; tc++) {
            N = sc.nextInt();
            L = sc.nextInt();

            scores = new int[N];
            cals = new int[N];

            for (int i = 0; i < N; i++) {
                scores[i] = sc.nextInt();
                cals[i] = sc.nextInt();
            } // input 끝
            ans = 0;

            makeBurger(0, 0, 0);
            System.out.println("#" + tc + " " + ans);
        } // tc
    } // main

    // 중간 결과를 들고 다니겠다!
    static void makeBurger(int idx, int sumScore, int sumCal) {
        // 기저조건: 모든 재료를 고려한 경우
        if (sumCal > L) return;
        if (idx == N) {
            ans = Math.max(sumScore, ans);
            return;
        }

        // 재료를 선택하는 경우
        makeBurger(idx + 1, sumScore + scores[idx], sumCal + cals[idx]);

        // 재료를 선택하지 않는 경우
        makeBurger(idx + 1, sumScore, sumCal);
    }
}