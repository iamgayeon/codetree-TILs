import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%3==0 || a%5 == 0){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }
    }
}