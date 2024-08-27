import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	
	static int[] arr2;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		// 수의 개수 n
		int n = Integer.parseInt(br.readLine());
		
		// 초기 좌표 배열 arr
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0;i < n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Set<Integer> removeDupl = new HashSet<>();
		for (int i = 0;i < n;i++) {
			removeDupl.add(arr[i]);
		}
		
		// 중복이 제거된 좌표 배열 arr2
		arr2 = new int[removeDupl.size()];
		int idx = 0;
		for (Integer num:removeDupl) {
			arr2[idx++] = num;
		}
		
		Arrays.sort(arr2);
		
		for (int i = 0;i < n;i++) {
			bw.write(binarySearch(arr[i]) + " ");
		}
		bw.flush();
		
		br.close();
		bw.close();
	}

	static int binarySearch(int i) {
		int left = 0;
		int right = arr2.length - 1;
		
		while (left <= right) {
			int mid = left + ((right - left) / 2);
			
			if (arr2[mid] == i) {
				return mid;
			} else if (arr2[mid] < i) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return 0;
	}
}