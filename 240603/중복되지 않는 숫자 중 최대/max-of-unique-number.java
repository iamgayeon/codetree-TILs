import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int temp = 0;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int count = 0;
            for(int i=0;i<n-1;i++){
                if(arr[0] == arr[i+1]){
                    count +=1;
            }
        }

            if(count == 0){
                System.out.print(arr[0]);
            }else{
                System.out.print(arr[count+1]);
            }
        
    }
}