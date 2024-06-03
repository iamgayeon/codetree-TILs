import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = -1;
        for(int i=0;i<n;i++){
            int nummax = arr[i];

            if(max < nummax){
                int count = 0;
                for(int j=0; j<n;j++){
                    if(arr[j] == nummax){
                        count++;
                    }
                }
                if(count == 1){
                    max = nummax;
                }
            }
        }

        System.out.println(max);
    }
}