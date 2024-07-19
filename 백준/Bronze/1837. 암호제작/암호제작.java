import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger p = new BigInteger(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int prime1 = -1;
        int prime2 = -1;

        for (int i = 2; i < k; i++) {
            if (p.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                prime1 = i;
                prime2 = p.divide(BigInteger.valueOf(i)).intValue();
                break;
            }
        }

        String answer;
        if (prime1 != -1 && prime1 < k) {
            answer = String.format("BAD %d", prime1);
        } else if (prime2 != -1 && prime2 < k) {
            answer = String.format("BAD %d", prime2);
        } else {
            answer = "GOOD";
        }

        System.out.println(answer);
    }
}