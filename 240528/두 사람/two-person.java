import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        char a = sc.next().charAt(0);
        int b1 = sc.nextInt();
        char b = sc.next().charAt(0);
        if(a1 >= 19 || b1>= 19){
            if(a == 'M' || b == 'M'){
                System.out.print(1);
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