import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
        Scanner sc = new Scanner(System.in);
        // 단어 s
        String s = sc.next().toUpperCase();
        // 알파벳 등장 횟수 기록할 해시맵 count
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 65;i <= 90;i++) {
        	count.put((char) i, 0);
        }
        // 단어 순회하면서 카운팅
        for (int i = 0;i < s.length();i++) {
        	count.put(s.charAt(i), count.get(s.charAt(i)) + 1);
        }
        for (Map.Entry<Character, Integer> entry:count.entrySet()) {
        	bw.write(entry.getValue() + " ");
        }
        bw.flush();
        
        bw.close();
        sc.close();
    }
}