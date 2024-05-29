import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int n = sc.nextInt();
        for(int i=1;;i++){

            if(n > 1){
                n = n / i;
                cnt += 1;
               
            }
            else {
                break;
            }
        }
        System.out.print(cnt);

    }
}