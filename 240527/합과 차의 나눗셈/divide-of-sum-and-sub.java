import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c1 = a+b;
        double c2 = a-b;
        double c = c1/c2;
        System.out.printf("%.2f",c);

    }
}