import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int n = sc.nextInt();

        char c1 = sc.next().charAt(0);
        int n1 = sc.nextInt();

        char c2 = sc.next().charAt(0);
        int n2 = sc.nextInt();

        if((c == 'Y' || c1 == 'Y' && c2 =='Y') && (n >=37 || n1 >=37 && n2 >=37)){
            System.out.print("E");
        }
        else{
            System.out.print("N");
        }
    }


}