import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        

        for(int j =0;j<q;j++){
            int a = sc.nextInt();
            if(a == 1){
                int b = sc.nextInt();
                System.out.println(arr[b-1]);

            }else if(a == 2){
                int b = sc.nextInt();
                int count = 0;
                for(int i=0;i<n;i++){
                    if(arr[i] ==b){
                        System.out.println(i+1);
                        count = 1;
                        break;
                    }
                }
                if(count == 0){
                        System.out.println(0);
                    }

            }else if(a==3){
                int b = sc.nextInt();
                int c = sc.nextInt();
                for(int i=b-1;i<c;i++){
                    {
                        System.out.print(arr[i] +" ");
                    }
            
                }
                System.out.println();

            }
        }

    

        
    }
}