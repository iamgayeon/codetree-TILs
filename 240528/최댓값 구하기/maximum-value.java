import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a<b && a <c){
            System.out.print(c);
        }
        else if(c<a && b<a){
            System.out.print(a);
        }
        else{
            System.out.print(b);
        }

    }
}