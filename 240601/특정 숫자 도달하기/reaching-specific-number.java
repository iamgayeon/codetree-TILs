import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        int count = 0;
        
        for(int i =0;i<10;i++){
            arr[i] = sc.nextInt();
        }

        for(int i =0;i<10;i++){
            if(arr[i]<250){
                sum += arr[i];
                count +=1;
                
            }
            else{
                break;
            }
        }

        double avg = (double)sum / count;
        System.out.printf("%d %.1f", sum, avg);
    }
}