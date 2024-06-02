import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        

        int[] arr= new int[n];
        int temp=0;

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i=0;i<n-1;i++){
            if(arr[i] < arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                }
            }
        System.out.print(arr[0] + " ");
        System.out.print(arr[1]);

        }
}