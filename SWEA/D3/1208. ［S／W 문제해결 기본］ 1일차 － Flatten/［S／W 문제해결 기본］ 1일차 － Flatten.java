import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        // 테스트 케이스 순회 시작
        for (int t = 1;t <= 10;t++) {
            // 덤프 가능 횟수 입력
            int dumpPossibleCount = Integer.parseInt(br.readLine());
            // 상자 높이 배열 입력
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] height = new int[100];
            for (int i = 0;i < 100;i++) {
                height[i] = Integer.parseInt(st.nextToken());
            }
            // 최고점과 최저점을 찾고 최고점에서는 1을 빼고, 최저점에서는 1을 더하는 과정 반복
            for (int i = 0;i < dumpPossibleCount;i++) {
                int maxIdx = 0;
                int minIdx = 0;
                for (int j = 1;j < 100;j++) {
                    if (height[j] > height[maxIdx])
                        maxIdx = j;
                    if (height[j] < height[minIdx])
                        minIdx = j;
                }
                if (height[maxIdx] == height[minIdx]) {
                    break;
                }
                height[maxIdx]--;
                height[minIdx]++;
            }
             
            // 최종 최대 값과 최솟값 찾기
            int maxVal = 0;
            int minVal = 0;
            for (int i = 1;i < 100;i++) {
                if (height[i] > height[maxVal])
                    maxVal = i;
                if (height[i] < height[minVal])
                    minVal = i;
            }
            if (height[maxVal] == height[minVal]) {
                System.out.println(String.format("#%d 0", t));
            } else {
                System.out.println(String.format("#%d %d", t, height[maxVal] - height[minVal]));
            }
        }
    }
}