import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int idx = 0;
        int count = 0;

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 2){
                count +=1;
                if(count == 3){
                    idx = i+1;
                }
            }
        }

        System.out.print(idx);

        
    }
}