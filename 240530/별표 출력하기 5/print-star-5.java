import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i =0;i<n;i++){
            for(int j=n;n>0;j--){
                for(int l = j;n>0;l--){
                    System.out.print("*");
                }
                System.out.print(" ");

            }
            System.out.println();
        }

    }
}