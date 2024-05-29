import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        for(int i =a;i<=b;i++){
            if(i%4==0){
                cnt+=1;
            }
        }

        if(cnt>=1){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }

    }
}