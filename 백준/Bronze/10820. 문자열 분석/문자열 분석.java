import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String str;
    	while ((str = br.readLine()) != null && !str.isEmpty()) {
    		int lowerCase = 0, upperCase = 0, digit = 0, whitespace = 0;
    		for (int i = 0;i < str.length();i++) {
    			char c = str.charAt(i);
    			
    			if (Character.isLowerCase(c)) {
    				lowerCase++;
    			} else if (Character.isUpperCase(c)) {
    				upperCase++;
    			} else if (Character.isDigit(c)) {
    				digit++;
    			} else {
    				whitespace++;
    			}
    		}
    		bw.write(String.format("%d %d %d %d\n", lowerCase, upperCase, digit, whitespace));
    	}
    	bw.flush();
    	
    	br.close();
    	bw.close();
    }
}