import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        int max = 100;

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i] < max){
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