import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String b = sc.next();


        while (true) {
            int index = s.indexOf(b);
            if (index == -1) {
                break;
            }
            s = s.substring(0, index) + s.substring(index + b.length());
        }

        System.out.print(s);
    }
}