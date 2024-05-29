import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s=0;
        while(s!=3){
            int n = sc.nextInt();
            if(n%2==1){
                continue;
            }
            else{
                n = n/2;
                System.out.println(n);
            }
            s=s+1;
            
        }

    }
}