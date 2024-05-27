import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1 >= 90){
            if(n2 >= 95){
                System.out.print(100000);
            }
            else if(n2 >= 90){
                System.out.print(50000);
            }
            else{
                System.out.print(0);
            }
        }
        else{
            System.out.print(0);
        }
    }
}