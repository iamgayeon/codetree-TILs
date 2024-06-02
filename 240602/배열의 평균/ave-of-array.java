import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[2][4];

        for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        
        for(int i=0;i<2;i++){
            double sum = 0.0;
            for(int j=0;j<4;j++){
                sum += arr[i][j];
            }
            sum = sum/4;
            System.out.printf("%.1f"+ " " , sum);
        }
        System.out.println();
        
        for(int i=0;i<4;i++){
            double sum = 0.0;
            for(int j=0;j<2;j++){
                sum += arr[j][i];
            }
            sum = sum/2;
            System.out.printf("%.1f"+ " " , sum);
        }
        System.out.println();

        for(int i=0;i<2;i++){
            double s = 0.0;
            for(int j=0;j<4;j++){
                s += arr[i][j];
            }
            s = s/8;
        
        }
        System.out.printf("%.1f" , s);


 
        
    }
}