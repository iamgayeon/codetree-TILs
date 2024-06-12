import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        
        while (n > 0) {
            sum += n % 10; // 마지막 자리 숫자를 더함
            n /= 10;       // 마지막 자리 숫자를 제거함
        } 
        
        System.out.print(sum); 
    }
}