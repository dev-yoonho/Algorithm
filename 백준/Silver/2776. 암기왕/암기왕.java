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
        // 테스트 케이스의 개수 입력
        int t = Integer.parseInt(br.readLine());
        for (int i = 0;i < t;i++) {
        	// 수첩 1의 정수 개수 입력
        	int noteFirst = Integer.parseInt(br.readLine());
        	// 수첩 1에 적힌 숫자 배열 만들기
        	int[] noteFirstNums = new int[noteFirst];
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for (int j = 0;j < noteFirst;j++) {
        		noteFirstNums[j] = Integer.parseInt(st.nextToken());
        	}
        	
        	// 이분 탐색을 위해 수첩 1 숫자 배열 정렬
        	Arrays.sort(noteFirstNums);
        	
        	// 수첩 2의 정수 개수 입력
        	int noteSecond = Integer.parseInt(br.readLine());
        	// 이분 탐색후 결과 출력
        	StringTokenizer st2 = new StringTokenizer(br.readLine());
        	for (int j = 0;j < noteSecond;j++) {
        		bw.write(binarySearch(noteFirstNums, Integer.parseInt(st2.nextToken())) + "\n");
        	}
        }
        bw.flush();
        
        br.close();
        bw.close();
	}

	static char binarySearch(int[] noteFirstNums, int key) {
		int left = 0;
		int right = noteFirstNums.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (noteFirstNums[mid] == key) {
				return '1';
			} else if (noteFirstNums[mid] < key) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return '0';
	}
}