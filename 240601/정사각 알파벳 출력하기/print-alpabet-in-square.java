import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 65;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                System.out.print((char)(ch));
                ch = (char)(ch + 1);
                
            }
            System.out.println();
        }

        
    }
}