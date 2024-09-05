import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 후보의 수 N
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        int dasom = Integer.parseInt(br.readLine());
        int cnt = 0;


        for (int i = 1; i < N; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }

        if (N == 1) {
            System.out.println(0);
        } else {
            while (pq.peek() >= dasom) {
                int temp = pq.poll();
                pq.add(temp - 1);

                dasom++;
                cnt++;
            }

            System.out.println(cnt);
        }
    }
}