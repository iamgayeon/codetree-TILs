import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=2;
        int m = sc.nextInt();

        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print("*");
            }
        
            System.out.println();
        }
System.out.println();
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        
        

    }
}