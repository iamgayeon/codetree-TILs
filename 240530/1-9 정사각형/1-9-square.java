import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int n= sc.nextInt();

        for(int i =1;i<=n;i++){
            for(int j=1;j<=n;j++){
                cnt +=1;
                System.out.print(cnt);
                if(cnt == 9){
                cnt = 0;
            }
            }
            
            System.out.println();
        }
    }
}