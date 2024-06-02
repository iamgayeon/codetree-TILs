import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        

        int[] arr= new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(max < arr[i]){
                max = arr[i];
            }

        }
        int max1 = 0;
        for(int i=0;i<n;i++){
            if(arr[i] != max){
                if(max1 <arr[i]){
                    max1 = arr[i];
                }
            }


        }
        System.out.print(max + " ");
        System.out.print(max1);

        
    }
}