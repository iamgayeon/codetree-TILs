import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int cnt = 0;
        for(int i=1;i<=n;i++){
            int c = sc.nextInt();
            sum +=c;
            cnt +=1;
        }
        System.out.print(sum + " ");
        System.out.printf("%.1f", (double)sum/cnt);
    }
}