import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int max = 998;
        int min = -998;

       while(true){
            int num = sc.nextInt();

            if(num == 999 || num == -999){
                break;
            }
            else{
                if(max > num){
                    max = num;
                }
                if(min < num){
                    min = num;

                }
            }
        }
        System.out.print(min + " ");
        System.out.print(max);

    }
}