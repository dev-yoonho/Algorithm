import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 배열의 크기 입력 받기
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        
        // 배열 요소 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0;i < n;i++) {
        	nums[i] = Integer.parseInt(st.nextToken());
        }
        
        // 최대값 구하기
        int max = Integer.MIN_VALUE;
        for (int i:nums) {
        	max = Math.max(max, i);
        }
        
        // count 배열 만들기
        int[] count = new int[max + 1];
        
        // 각 요소의 빈도 계산하기
        for (int i = 0;i < n;i++) {
        	count[nums[i]]++; 
        }
        
        // 누적합 계산하기
        for (int i = 1;i <= max;i++) {
        	count[i] += count[i - 1];
        }
        
        // 결과 배열 생성하기
        int[] result = new int[n];
        for (int i = n - 1;i >= 0;i--) {
        	result[count[nums[i]] - 1] = nums[i];
        	count[nums[i]]--;
        }
        
        System.out.println(result[n / 2]);
    }
    
}