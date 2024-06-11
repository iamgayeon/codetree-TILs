import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            char b = s.charAt(i);
            if (b >= '0' && b <= '9') {
                // 문자를 숫자로 변환하여 합산
                answer += (b - '0');
            }
        }
        
        // 결과 출력
        System.out.print(answer);
    }
}