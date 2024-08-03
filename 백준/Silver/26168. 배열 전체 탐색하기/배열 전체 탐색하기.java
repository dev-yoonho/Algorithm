import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // 정수형 배열 A의 크기 n, 정수형 배열 B의 크기 m(질의의 개수)
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

        // 정수형 배열 A의 초기화 및 값 입력
        long[] A = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Long.parseLong(st.nextToken());
        }

        // 배열 A 정렬
        Arrays.sort(A);

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            if (command == 1) {
                long k = Long.parseLong(st.nextToken());
                int left = 0;
                int right = n - 1;
                int idx = n;

                while (left <= right) {
                    int mid = (left + right) / 2;
                    if (A[mid] >= k) {
                        right = mid - 1;
                        idx = mid;
                    } else {
                        left = mid + 1;
                    }
                }
                int answer = n - idx;
                bw.write(answer + "\n");
            } else if (command == 2) {
                long k = Long.parseLong(st.nextToken());
                int left = 0;
                int right = n - 1;
                int idx = n;

                while (left <= right) {
                    int mid = (left + right) / 2;
                    if (A[mid] > k) {
                        right = mid - 1;
                        idx = mid;
                    } else {
                        left = mid + 1;
                    }
                }
                int answer = n - idx;
                bw.write(answer + "\n");
            } else if (command == 3) {
                long iVal = Long.parseLong(st.nextToken());
                long jVal = Long.parseLong(st.nextToken());

                int left = 0;
                int right = n - 1;
                int idx1 = n;
                int idx2 = -1;

                while (left <= right) {
                    int mid = (left + right) / 2;
                    if (A[mid] >= iVal) {
                        right = mid - 1;
                        idx1 = mid;
                    } else {
                        left = mid + 1;
                    }
                }

                left = 0;
                right = n - 1;

                while (left <= right) {
                    int mid = (left + right) / 2;
                    if (A[mid] <= jVal) {
                        left = mid + 1;
                        idx2 = mid;
                    } else {
                        right = mid - 1;
                    }
                }

                int answer = (idx1 > idx2 || idx1 == n || idx2 == -1) ? 0 : idx2 - idx1 + 1;
                bw.write(answer + "\n");
            }
        }
        bw.flush();

        br.close();
        bw.close();
    }
}