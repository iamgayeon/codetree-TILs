import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 4;
        String[] arr = new String[5];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[n-i-1]);
        }
    }
}