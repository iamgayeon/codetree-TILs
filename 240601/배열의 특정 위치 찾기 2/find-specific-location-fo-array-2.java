import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for(int i=0;i<10;i++){
           arr[i]=sc.nextInt();
        }
        int sum1=0;
        for(int i=0;i<10;i+=2){
            sum1 += arr[i];
        }

        int sum2=0;
        for(int i=1;i<10;i+=2){
           sum2 += arr[i];
        }

        if(sum1 > sum2){
            System.out.print(sum1-sum2);
        }
        else{
            System.out.print(sum2-sum1);
        }

    }
}