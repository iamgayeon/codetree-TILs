import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            cnt+=1;
        }

        for(int i=cnt-1;i>=0;i--){
            if(arr[i]%2==0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}