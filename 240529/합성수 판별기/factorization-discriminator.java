import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int n =sc.nextInt();
        for(int i =1;i<n;i++){
            if(n%i==0){
                cnt += 1;
            }
        }

        if(cnt>=1){
            System.out.print("C");
        }
        else{
            System.out.print("N");
        }

    }
}