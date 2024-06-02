import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int[] arr = new int[n];
        arr[0] = sc.nextInt();
        int max = arr[0];

        for(int i=1;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i] < arr[i-1]){
                max = arr[i];
            }
        }
        int count =0;
        for(int i=0;i<n;i++){
            if(arr[i] == max){
                count += 1;
            }
        }

        System.out.print(max + " ");
        System.out.print(count);

        
    }
}