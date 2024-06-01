import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[9];

        while(true){
            int num = sc.nextInt();

            if(num == 0)
                break;

            if(num >=10){
                int i = num /10;
                arr[i-1] +=1;
            }
        }

        for(int i =0;i<9;i++){
            System.out.println(i+1 + " - " + arr[i]);
        }

        
    }
}