import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(3){
            int n = sc.nextInt();
            if(n%2==1){
                continue;
            }
            else{
                System.out.println(n/2);
            }
        }

    }
}