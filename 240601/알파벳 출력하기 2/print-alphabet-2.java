import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        int n = sc.nextInt();
        char ch = 'A';
        for(int i=1;i<=n;i++){

            for(int j=0;j<i;j++){
                System.out.print(" ");
            }



            for(int j=n;j>0;j--){
                System.out.print((char)ch + " ");

                if(ch == 'Z'){
                    ch = 'A';
                    continue;
                }
                ch+=1;
            }
            System.out.println();
        }

        
    }
}