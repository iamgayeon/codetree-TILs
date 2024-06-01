import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[100];
        int cnt = 0;

        for(int i=0;i<100;i++){
            arr[i] = sc.nextInt();
            cnt+=1;
            if(arr[i] == 0){
                break;
            }
        
        }

        for(int i=0;i<cnt-1;i++){
            if(arr[i] %2==1){
                arr[i] = arr[i]+3;
                System.out.print(arr[i] + " ");
            }
            else{
                arr[i] = arr[i]/2;
                System.out.print(arr[i] + " ");
            }
        }

        
    }
}