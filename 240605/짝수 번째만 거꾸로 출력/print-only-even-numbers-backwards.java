import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        

        for(int j = str.length() - 1; j >= 0; j--) {
            if(j % 2 == 1) {
                System.out.print(str.charAt(j));
            }
        }      
    }
}