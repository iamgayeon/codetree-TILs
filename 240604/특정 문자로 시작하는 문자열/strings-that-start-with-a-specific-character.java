import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }
        char c = sc.next().charAt(0);
        int j=0;
        int count = 0;
        double sum = 0.0;
        for(int i=0;i<n;i++){
            j = arr[i].length();
            if(arr[i].charAt(0) == c){
                count +=1;
                sum += arr[i].length();
            }
        }
        sum /= count;

        System.out.printf("%d %.2f", count, sum);

    }
}