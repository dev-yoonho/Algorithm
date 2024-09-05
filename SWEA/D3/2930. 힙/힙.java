import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();

            PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

            bw.write("#" + tc + " ");

            for (int i = 0; i < N; i++) {
                int cmd = sc.nextInt();
                if (cmd == 1) pq.add(sc.nextInt());
                else {
                    if (pq.isEmpty()) bw.write(-1 + " ");
                    else bw.write(pq.poll() + " ");
                }
            }
            bw.write("\n");
        }
        bw.flush();

        bw.close();
    }
}