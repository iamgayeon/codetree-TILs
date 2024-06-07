import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = sc.next();
        int c1 = -1;
        
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = 0; j < s1.length() - 1; j++) {
                if (s.charAt(i) == s1.charAt(j) && s.charAt(i + 1) == s1.charAt(j + 1)) {
                    c1 = i;
                    break;
                }
            }
            if (c1 != -1) // 이미 c1이 찾아졌다면 반복을 종료합니다.
                break;
        }
        
        System.out.print(c1);
    }
}