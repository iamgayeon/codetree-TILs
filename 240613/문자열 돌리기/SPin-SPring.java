import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열 입력 받기
        String input = sc.nextLine();
        int L = input.length();

        System.out.println(input);
        // 문자열을 오른쪽으로 한 글자씩 밀어서 L회 출력
        for (int i = 0; i < L; i++) {
            // 오른쪽으로 한 글자씩 밀기
            String rotated = input.substring(L - 1) + input.substring(0, L - 1);
            System.out.println(rotated);
            // 문자열을 오른쪽으로 한 글자씩 밀기 위해 갱신
            input = rotated;
        }
    }
}