import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int s = sc.nextInt();
            if((s % 2 == 1) && (s % 3 == 0)){
                sum += i;
            }
        }
        System.out.print(sum);
    }
}