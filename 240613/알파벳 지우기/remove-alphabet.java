import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두 개의 문자열 입력 받기
        String str1 = sc.next();
        String str2 = sc.next();

        // 첫 번째 문자열에서 숫자만 추출하여 이어붙이기
        String numberStr1 = "";
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (Character.isDigit(c)) {
                numberStr1 += c;
            }
        }

        // 두 번째 문자열에서 숫자만 추출하여 이어붙이기
        String numberStr2 = "";
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if (Character.isDigit(c)) {
                numberStr2 += c;
            }
        }

        // 각 문자열에서 추출된 숫자를 정수로 변환
        int num1 = 0;
        if (numberStr1.length() > 0) {
            num1 = Integer.parseInt(numberStr1);
        }

        int num2 = 0;
        if (numberStr2.length() > 0) {
            num2 = Integer.parseInt(numberStr2);
        }

        // 두 수의 합을 계산하고 출력
        System.out.println(num1 + num2);
    }
}