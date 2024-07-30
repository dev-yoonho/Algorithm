import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] checkList = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0;i < n;i++) {
        	checkList[i] = Integer.parseInt(st.nextToken());
        }
        
        int m = Integer.parseInt(br.readLine());
        int[] numNeedCheck = new int[m];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0;i < m;i++) {
        	numNeedCheck[i] = Integer.parseInt(st2.nextToken());
        }
        
        Arrays.sort(checkList);
        
        for (int i:numNeedCheck) {
        	System.out.println(binarySearch(checkList, i) ? "1":"0");
        }
    }
    static boolean binarySearch(int[] arr,int num) {
    	int left = 0;
    	int right = arr.length - 1;
    	while (left <= right) {
    		int mid = (left + right) / 2;
    		if (arr[mid] == num) {
    			return true;
    		} else if (arr[mid] < num) {
    			left = mid + 1;
    		} else {
    			right = mid - 1;
    		}
    	}
    	return false;
    }
}