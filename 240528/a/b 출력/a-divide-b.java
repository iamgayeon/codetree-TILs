import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i =0;i<21;i++){
        int m = a /b;
        int n = a%b;
        a = n * 10;
        System.out.print(m);
        if(i==0){
            System.out.print(".");
        }

        }

    }
}