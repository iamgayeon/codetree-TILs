import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        int b = 0;
        int s = 1000;

        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<10;i++){
           if(arr[i] < 500){
                if(arr[i] > b){
                    b = arr[i];
                }

           }
           if(arr[i] > 500){
                if(arr[i] < s){
                    s = arr[i];
                }
           }
        }

        System.out.print(b +" ");
         System.out.print(s);

        
    }
}