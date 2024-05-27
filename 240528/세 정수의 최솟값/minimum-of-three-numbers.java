import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 4 5 6
        if(a < b && a < c){
              System.out.print(a);
            }
        // 5 4 6
        if(b < c){
            if(b < a){
                System.out.print(b);
            }
        // 6 5 4
        if(b < a){
            if(c < b){
                System.out.print(c);
            }
        }
        }
    }
}