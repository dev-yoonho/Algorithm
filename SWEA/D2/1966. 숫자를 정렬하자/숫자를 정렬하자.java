import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int t = Integer.parseInt(br.readLine());
    	
    	for (int tc = 1;tc <= t;tc++) {
    		int n = Integer.parseInt(br.readLine());
    		int[] nums = new int[n];
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		for (int i = 0;i < n;i++) {
    			nums[i] = Integer.parseInt(st.nextToken());
    		}
    		
    		insertionSort(nums);
    		
    		bw.write("#" + tc + " ");
    		for (int i:nums) {
    			bw.write(i + " ");
    		}
    		bw.write("\n");
    	}
    	bw.flush();
    	
    	br.close();
    	bw.close();
	}

	static void insertionSort(int[] nums) {
		for (int i = 1;i < nums.length;i++) {
			int key = nums[i];
			int j = i - 1;
			
			while (j >= 0 && nums[j] > key) {
				nums[j + 1] = nums[j]; 
				j--;
			}
			nums[j + 1] = key;
		}
		
	}
}