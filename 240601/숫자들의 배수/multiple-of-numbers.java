import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int count = 0;

        int n = sc.nextInt();

        for(int i=0;i<10;i++){
            arr[i] = n*(i+1);
            if(arr[i]%5==0){
                count++;
            
                if(count ==3){
                    break;
                } else{
                    System.out.print(arr[i] +" ");
                }
                
            } else{
                System.out.print(arr[i] +" ");
            }
            
        }
        
    }

}