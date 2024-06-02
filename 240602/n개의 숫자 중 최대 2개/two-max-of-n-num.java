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
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
      
        System.out.print(arr[9] + " ");
        System.out.print(arr[8 ]);

    }
}