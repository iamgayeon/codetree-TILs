import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];
        int cnt = 0;
        
        int n = sc.nextInt();

        for(int i =0;i<n;i++){
            int sum = 0;
            for(int j=0;j<4;j++){
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            double avg = (double) sum/4;
            if(avg >= 60){
                System.out.println("pass");
                cnt +=1;
            } 
            else{
                System.out.println("fail");
            }

            
        }
        System.out.print(cnt);

        
    }
}