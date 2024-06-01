import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[6];

        for(int i =0;i<10;i++){
            int num = sc.nextInt();

            arr[num-1] += 1; 
        }
        for(int i = 0;i<6;i++){
            System.out.println(i+1 + " - " + arr[i]);
        }

        
    }
}