import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Node {
	String data;
	Node link;
}

class SinglyLinkedList {
	Node head;
	int size;
	
	SinglyLinkedList() {
		head = new Node();
	}
	
	// 삽입
	void addData(int i, String data) {
		if (0 > i || i > size) {
			System.out.println("삽입할 위치가 잘못되었습니다.");
			return;
		}
		size++;
		
		Node newNode = new Node();
		newNode.data = data;
		
		Node curr = head;
		for (int k = 0;k < i;k++) {
			curr = curr.link;
		}
		
		newNode.link = curr.link;
		curr.link = newNode;
	}
	// 삭제
	void removeData(int i) {
		if (0 > i || i >= size) {
			System.out.println("삭제할 위치가 잘못되었습니다.");
			return;
		}
		size--;
		
		Node curr = head;
		
		for (int k = 0;k < i;k++) {
			curr = curr.link;
		}
		
		curr.link = curr.link.link;
	}
	// 조회
	String printAll() {
		Node curr = head.link;
		
		int cnt = 1;
		
		String result = "";
		
		while (cnt <= 10) {
			result += (curr.data + " ");
			curr = curr.link;
			
			cnt++;
		}
		return result;
	}
}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		for (int tc = 1;tc <= 10;tc++) {
			// 원본 암호문의 길이 n
			int n = Integer.parseInt(br.readLine());
			
			// 원본 암호문(SinglyLinkedList로 생성)
			SinglyLinkedList cipher = new SinglyLinkedList();
			st = new StringTokenizer(br.readLine());
			
			while (st.hasMoreTokens()) {
				cipher.addData(cipher.size, st.nextToken());
			}
			
			// 명령어의 개수 k
			int k = Integer.parseInt(br.readLine());
			
			// 명령어
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				String com = st.nextToken();
				while (com.equals("I") || com.equals("D")) {
					if (com.equals("I")) {
						// 삽입할 위치 x
	 					int x = Integer.parseInt(st.nextToken());
	 					// 삽입 횟수 y
						int y = Integer.parseInt(st.nextToken());
						// 삽입 문자열 s
						for (int i = 0;i < y;i++) {
							cipher.addData(x++, st.nextToken());
						}
					} else {
						// 삭제할 위치 x
						int x = Integer.parseInt(st.nextToken());
						// 삭제 횟수 y
						int y = Integer.parseInt(st.nextToken());
						for (int i = 0;i < y;i++) {
							cipher.removeData(x);
						}
					}
					break;
				}
			}
			
			// 출력
			bw.write(String.format("#%d %s\n", tc, cipher.printAll()));
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
}