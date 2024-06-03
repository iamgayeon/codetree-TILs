import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int count = 0;

        for(int i=0;i<n;i++){
            if(arr[i] > max){
                if(arr[i] != max){
                    count = 1;
                    max = arr[i];
                } else{
                    count +=1;
                }
                
            }
        }

        if(count == 1){
            System.out.print(max);
        }else{
            System.out.print(-1);
        }

        
    }
}