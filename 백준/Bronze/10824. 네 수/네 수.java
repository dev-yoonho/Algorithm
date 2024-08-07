import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	String strnum1 = st.nextToken() + st.nextToken(), strnum2 = st.nextToken() + st.nextToken();
    	
    	long num1 = Long.valueOf(strnum1), num2 = Long.valueOf(strnum2);
    	
    	System.out.println(num1 + num2);
    }
}