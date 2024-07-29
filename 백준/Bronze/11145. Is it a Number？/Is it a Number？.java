import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine().strip());
        
        for (int i = 0; i < t; i++) {
            String input = br.readLine().strip();
            
            // 정규 표현식 사용
            String regex = "^[\\s]*([\\d]+)[\\s]*$";
            if (input.matches(regex)) {
                try {
                    // 공백 제거 후 숫자 부분 추출 및 BigDecimal로 변환
                    BigDecimal number = new BigDecimal(input.trim());
                    System.out.println(number.toPlainString());
                } catch (Exception e) {
                    System.out.println("invalid input");
                }
            } else {
                System.out.println("invalid input");
            }
        }
    }
}
