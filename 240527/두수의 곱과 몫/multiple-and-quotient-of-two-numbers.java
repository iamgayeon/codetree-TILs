import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.NextInt();
        int b = sc.NextInt();

        System.out.println(a+" * "+b+" = " + (a*b));
        System.out.println(a+" / "+b+" = " + (a/b));

    }
}