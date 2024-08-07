import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 숫자 카드의 개수 n
        int n = Integer.parseInt(br.readLine());
        // 숫자 카드 배열 nums
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Long.parseLong(br.readLine());
        }
        Arrays.sort(nums);
        // 카운팅 해시맵
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0;i < n;i++) {
        	map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        // 해시맵 돌면서 가장 큰 값 찾기
        long maxIndex = Long.MIN_VALUE;
        int max = 0;
        for (Map.Entry<Long, Integer> entry:map.entrySet()) {
        	if (max < entry.getValue()) {
        		max = entry.getValue();
        		maxIndex = entry.getKey();
        	} else if (max == entry.getValue() && maxIndex > entry.getKey()) {
        		maxIndex = entry.getKey();
        	}
        }
        bw.write(maxIndex + "\n");
        bw.flush();
        
        br.close();
        bw.close();
    }
}