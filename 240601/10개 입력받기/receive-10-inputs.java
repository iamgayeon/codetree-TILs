import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[10];
        int cnt = 0;
        int sum = 0;

        for(int i =0;i<10;i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 0){
                break;
            }
            else{
                sum += arr[i];
                cnt +=1;
            }
        }
        System.out.print(sum + " ");
        System.out.printf("%.1f", (double)sum/cnt);
        
    }
}