import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = 1;

        int[][] arr = new int[n][n];
        
        for(int i=0;i<n;i++){
            num = i+1;
            for(int j=0;j<n;j++){
                if(j==0){
                    arr[i][j] = i+1;
                }else{
                    arr[i][j] = n + num;
                    num = n + num;
                }
               
            }
            
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }






        
    }
}