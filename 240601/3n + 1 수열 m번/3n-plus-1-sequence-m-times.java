import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int cnt = 0;
        
        for(int i =1;i<=num;i++){
            int n = sc.nextInt();
            while(true){

                if(n==1){
                    break;
                }
                if(n%2==0){
                    n= n/2;
                    cnt+=1;
                }
                else{
                    n = n*3+1;
                    cnt +=1;
                }
            }
            System.out.println(cnt);
        }

    }
}