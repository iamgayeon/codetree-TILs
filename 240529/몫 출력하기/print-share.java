import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        while(true){
            cnt+=1;
            int n = sc.nextInt();
            if (cnt >4){
                break;
            }
            if(n%2==1){

            }
            else{
                System.out.println(n/2);
            }
        }

    }
}