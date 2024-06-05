import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();
        char c = 0;

        int count = Math.min(n, str.length());

        for(int i=0, j = str.length() - 1; i < count; i++, j--){
            System.out.print(str.charAt(j));

        }      
    
    
    }
}