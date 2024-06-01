import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        
        int sum = 1;
        for(int j=0;j<n;j++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int i=a;i<=b;i++){
                sum *= i;
            }
            System.out.println(sum);
            sum = 1;
        }
        
        
    }
}