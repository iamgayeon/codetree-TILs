import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int num = 0;
        while(a!=0){
            if(a>0){
                num = a/b;
                int i = a%b;
                arr[i] +=1;
                a = num;
            }
        }


        

        int sum = 0;
        for(int i =0;i<10;i++){
            sum = sum + (arr[i] * arr[i]);
        }
        System.out.print(sum);

        
    }
}