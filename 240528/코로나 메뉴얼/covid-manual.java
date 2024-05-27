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

        if(((c == 'Y' && n >=37) && (c1 == 'Y' && n1 >=37)) || ((c1 == 'Y' && n1 >=37) && (c2 == 'Y' && n2 >=37)) || ((c2 == 'Y' && n2 >=37) && (c == 'Y' && n >=37))){
            System.out.println("E");
        }
        else{
            System.out.println("N");
        }
    }
    }