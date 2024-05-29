import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int cnt = 0;
         if (n==1)
            System.out.print(0);
        while(true){
            if(n % 2 ==0 ){
                n = n/2;
                cnt+=1;
            }
            else{
                n = n*3+1;
                cnt+=1;
            }
            if(n == 1){
                break;
            }
        }
        System.out.print(cnt);

    }
}