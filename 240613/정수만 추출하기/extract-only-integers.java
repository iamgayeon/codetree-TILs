import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두 개의 문자열 입력 받기
        String str1 = sc.next();
        String str2 = sc.next();

        // 첫 번째 문자열에서 정수 부분 추출
        String numberStr1 = "";
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (Character.isDigit(c)) {
                numberStr1 += c;
            } else {
                break;
            }
        }

        int num1;
        if (numberStr1.length() > 0) {
            num1 = Integer.parseInt(numberStr1);
        } else {
            num1 = 0;
        }

        // 두 번째 문자열에서 정수 부분 추출
        String numberStr2 = "";
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if (Character.isDigit(c)) {
                numberStr2 += c;
            } else {
                break;
            }
        }

        int num2;
        if (numberStr2.length() > 0) {
            num2 = Integer.parseInt(numberStr2);
        } else {
            num2 = 0;
        }

        // 두 수의 합 출력
        System.out.println(num1 + num2);
    }
}