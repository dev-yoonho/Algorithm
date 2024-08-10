import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		// 스위치의 개수 n
		int n = Integer.parseInt(br.readLine());
		// 스위치 상태 배열 switch
		int[] switchCondition = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0;i < n;i++) {
			switchCondition[i] = Integer.parseInt(st.nextToken());
		}
		// 학생의 수 stundentNum
		int studentNum = Integer.parseInt(br.readLine());
		// 학생의 수만큼 반복문을 돌면서 스위치 상태 바꾸기
		for (int i = 0;i < studentNum;i++) {
			st = new StringTokenizer(br.readLine());
			int gender = Integer.parseInt(st.nextToken());
			int switchNum = Integer.parseInt(st.nextToken());
			if (gender == 1) switchCondition = maleSwitch(switchCondition, switchNum);
			else switchCondition = femaleSwitch(switchCondition, switchNum);
			
//			for (int j = 0;j < switchCondition.length;j++) {
//				if (j != 0 && j % 20 == 0) {
//					bw.write("\n");
//				}
//				bw.write(switchCondition[j] + " ");
//			}
//			bw.write("\n");
		}
		for (int i = 0;i < switchCondition.length;i++) {
			if (i != 0 && i % 20 == 0) {
				bw.write("\n");
			}
			bw.write(switchCondition[i] + " ");
		}
		bw.flush();
		
		br.close();
		bw.close();
	}

	private static int[] maleSwitch(int[] switchCondition, int switchNum) {
		int i = 2;
		int initSwitchNum = switchNum;
		while (switchNum <= switchCondition.length) {
//			System.out.println("현재 인덱스: " + switchNum);
//			System.out.println("현재 i: " + i);
			switchCondition[switchNum - 1] = Math.abs(switchCondition[switchNum - 1] - 1);
			switchNum = initSwitchNum * i;
			i++;
		}
		return switchCondition;
	}

	private static int[] femaleSwitch(int[] switchCondition, int switchNum) {
		int i = 1;
		switchCondition[switchNum - 1] = Math.abs(switchCondition[switchNum - 1] - 1);
		while (switchNum - 1 - i >= 0 && switchNum - 1 + i < switchCondition.length) {
	        // 양쪽 대칭 스위치가 같은 상태일 경우에만 토글
	        if (switchCondition[switchNum - 1 - i] == switchCondition[switchNum - 1 + i]) {
	            int temp = Math.abs(switchCondition[switchNum - 1 - i] - 1);
	            switchCondition[switchNum - 1 - i] = temp;
	            switchCondition[switchNum - 1 + i] = temp;
	            i++;
	        } else {
	            break; 
	        }
	    }
	    return switchCondition;
	}
}