import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        while(true){
            if(n >=10000){
                break;
            }
            if(n%2==0){
                n = n*3+1;
                cnt += 1;
            }
            else{
                n = n*3+2;
                cnt += 1;
            }
        }
        System.out.print(cnt);
    }
}