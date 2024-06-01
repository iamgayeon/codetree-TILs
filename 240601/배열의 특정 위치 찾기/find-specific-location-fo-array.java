import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;

        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=1;i<10;i+=2){
            sum += arr[i];
        }
        System.out.print(sum +" ");
        sum = 0;
        int count =0;
        
        for(int i=0;i<10;i++){
            if((i+1)%3==0){
                sum += arr[i];
                count +=1;
            }
        }
        System.out.printf("%.1f", (double)sum/count);

        




        
    }
}