import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];

        while(true){
            int num = sc.nextInt();
            if(num == 0){
                break;
            }
            if(num >= 10){
            int i = num /10;
            arr[i-1] += 1;
            }
        }
        int num = 100;
        for(int i =9;0<=i;i--){
            System.out.println(num + " - " + arr[i]);
            num -=10;
        }

        
    }
}