import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st;
    	
    	// 편집기 생성
    	LinkedList<Character> editor = new LinkedList<>();
    	
    	// 편집기에 입력되어 있는 문자열을 ArrayList editor에 집어넣음(편집을 위해서)
    	String sentence = br.readLine();
    	for (int i = 0;i < sentence.length();i++) {
    		editor.add(sentence.charAt(i));
    	}
    	
    	// 커서 초기 위치 설정
    	ListIterator<Character> iterator = editor.listIterator(editor.size());
    	// 입력할 명령어의 개수 M
    	int m = Integer.parseInt(br.readLine());
    	
    	// 명령어 입력 반복문 시작
    	for (int i = 0;i < m;i++) {
    		st = new StringTokenizer(br.readLine());
    		// 명령어 알파벳
    		String command = st.nextToken();
    		// L/D/B/P 조건 구분
    		if (command.equals("L") && iterator.hasPrevious()) {
    			iterator.previous();
    		} else if (command.equals("D") && iterator.hasNext()) {
    			iterator.next();
    		} else if (command.equals("B") && iterator.hasPrevious()) {
    			iterator.previous();
    			iterator.remove();
    		} else if (command.equals("P")){
    			char c = st.nextToken().charAt(0);
    			iterator.add(c);
    		}
    	}
    	for (char ch:editor) {
    		bw.write(ch);
    	}
    	bw.flush();
    	
    	br.close();
    	bw.close();
    }
}