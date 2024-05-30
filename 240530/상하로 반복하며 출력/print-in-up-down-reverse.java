import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int j=0;
        if(n > 1){
        for(int i=0;i<n;i++){

                System.out.print(i+1);
                System.out.print(n-j);
                System.out.print(i+1);
                System.out.print(n-j);
                j++;
                System.out.println();
                }
        }
        else{
            System.out.print(1);
        }
        }
        
    
}