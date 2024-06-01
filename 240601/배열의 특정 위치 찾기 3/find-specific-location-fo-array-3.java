import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr= new int[100];
        int sum = 0;
        int count = 0;

        for(int i=0;i<100;i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 0)
                break;
            else
                count +=1;
        }

        sum += arr[count-1];
        sum += arr[count-2];
        sum += arr[count-3];
        System.out.print(sum);

        
    }
}