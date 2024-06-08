import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();

        s = s.substring(0,1) + s.substring(2,n-2) + s.substring(n-1,n);

        System.out.print(s);

        
    }
}