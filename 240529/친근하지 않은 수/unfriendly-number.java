import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i= 1;i<=n;i++){
            if(i%2!=0 || i%3 !=0 || i%5 !=0){
                sum += 1;
            }
        }
        System.out.print(sum);
    }
}