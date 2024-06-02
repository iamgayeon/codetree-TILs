import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int num = 1;
        int num2;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Even row
                for (int j = 0; j < n; j++) {
                    System.out.print(num + " ");
                    num += 1;
                }
            } else {
                // Odd row
                num2 = num + 1;
                for (int j = 0; j < n; j++) {
                    System.out.print(num2 + " ");
                    num2 += 2;
                }
                num = num2 - 1; // Update num to the last printed value in the odd row
            }
            System.out.println();
        }
    }
}