import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        while(true){
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        char sen = sc.next().charAt(0);
        System.out.println(n1*n2);
        if (sen == 'C'){
            break;
        }
        }

    }
}