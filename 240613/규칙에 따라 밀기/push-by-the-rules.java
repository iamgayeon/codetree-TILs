import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String r = sc.next();

        for (int i = 0; i < r.length(); i++) {
            if (r.charAt(i) == 'L') {
                s = s.substring(1) + s.charAt(0);
            } else {
                s = s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);
            }
        }
        System.out.print(s);
    }
}