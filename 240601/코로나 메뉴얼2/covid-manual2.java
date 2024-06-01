import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int arr[]  = new int[4];

        for(int i=0;i<3;i++){
            char ch = sc.next().charAt(0);
             int n = sc.nextInt();
            if(ch == 'Y'){
                if(n >= 37){
                    arr[0]+=1;
                    cnt+=1;
                }else{
                    arr[2]+=1;
                 }
            }else{
                if(n >= 37){
                    arr[1]+=1;
                }
                else{
                    arr[3]+=1;
                 }
            }
        }
        for(int i=0;i<4;i++){
            System.out.print(arr[i] + " ");
        }
        if(cnt >= 2){
            System.out.print("E");
        }

        
    }
}