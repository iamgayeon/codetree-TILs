import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for(int i=2;i<=n-1;i++){
            if(n%i == 0){
                cnt +=1;
            }
        }
        if(cnt >=1){
            System.out.print("P");
        }
        else{
            System.out.print("C");
        }
    }
}