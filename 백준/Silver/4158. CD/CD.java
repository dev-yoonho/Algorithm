import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        while (n != 0 && m != 0) {
        	int[] nList = new int[n];
            for (int i = 0;i < n;i++) {
            	nList[i] = Integer.parseInt(br.readLine());
            }
            
            Arrays.sort(nList);
            
            int cnt = 0;
            for (int i = 0;i < m;i++) {
            	int checkNum = Integer.parseInt(br.readLine());
            	cnt += binarySearch(nList, checkNum);
            }
            System.out.println(cnt);
            
            StringTokenizer stEnd = new StringTokenizer(br.readLine());
            n = Integer.parseInt(stEnd.nextToken());
            m = Integer.parseInt(stEnd.nextToken());
        }
    }

	static int binarySearch(int[] nList, int checkNum) {
		int left = 0;
		int right = nList.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (nList[mid] == checkNum) {
				return 1;
			} else if (nList[mid] < checkNum) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return 0;
	}
}