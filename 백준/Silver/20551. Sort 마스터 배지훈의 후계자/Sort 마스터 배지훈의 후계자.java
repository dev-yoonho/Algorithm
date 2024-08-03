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

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        
        int[] A = new int[n];
        for (int i = 0;i < n;i++) {
        	A[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(A);
        
        for (int i = 0;i < m;i++) {
        	int d = Integer.parseInt(br.readLine());
        	
        	int left = 0;
            int right = A.length - 1;
            int idx = -1;
            
            while (left <= right) {
            	int mid = left + ((right - left) / 2);
            	if (A[mid] < d) {
            		left = mid + 1;
            	} else {
            		right = mid - 1;
            		idx = mid;
            	}
            }
            int answer = binarySearch(A, d) ? idx:-1;  
            bw.write(answer + "\n");
        }
        bw.flush();
        
        br.close();
        bw.close();
    }

	private static boolean binarySearch(int[] a, int d) {
    	int left = 0;
        int right = a.length - 1;
        
        while (left <= right) {
        	int mid = left + ((right - left) / 2);
        	if (a[mid] == d) {
        		return true;
        	}
        	else if (a[mid] < d) {
        		left = mid + 1;
        	} else {
        		right = mid - 1;
        	}
        }
		return false;
	}
}