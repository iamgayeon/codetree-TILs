import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int count = 1;

        // Find the maximum value and count its occurrences
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count = 1; // Reset count since we found a new maximum
            } else if (arr[i] == max) {
                count++; // Increment count for duplicate maximum values
            }
        }

        // Output the result
        if (count == 1) {
            System.out.print(max);
        } else {
            System.out.print(-1);
        }
    }
}