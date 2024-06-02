import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int m = sc.nextInt();


        int[][] arr = new int[n][m];
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[n][m] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr1[n][m] = sc.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[n][m] == arr1[n][m]){
                    arr2[n][m] = 0;
                }else{
                    arr2[n][m] = 1;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr2[n][m]);
            }
            System.out.println();
        }


        
    }
}