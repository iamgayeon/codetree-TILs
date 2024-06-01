import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];

        int n = sc.nextInt();

        arr[0] = 1;
        arr[1] = n;
        int sum = 0;
        
        int count = 1;

        for(int i=1;i<100;i++){
            arr[i+1] = arr[i] + arr[i-1];
            count +=1;
            if(arr[i+1] > 100){
                break;
            }
        }
        for(int i=0;i<count;i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}