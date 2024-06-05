import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder encodedString = new StringBuilder();

        // 첫 번째 문자와 카운터 초기화
        char c = s.charAt(0);
        int count = 1;

        // 문자열 순회
        for (int i = 1; i < s.length(); i++) {
            if (c == s.charAt(i)) {
                count++;
            } else {
                // 현재 문자와 카운트를 결과 문자열에 추가
                encodedString.append(c).append(count);
                // 새로운 문자와 카운터 초기화
                c = s.charAt(i);
                count = 1;
            }
        }
        
        // 마지막 문자와 카운트를 결과 문자열에 추가
        encodedString.append(c).append(count);

       System.out.println(encodedString.length());
        System.out.println(encodedString);
    
    }
}