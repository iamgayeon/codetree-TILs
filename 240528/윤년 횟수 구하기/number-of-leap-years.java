import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i=1;i<n;i++){
            if(n%4==0){
                cnt++;}
            else if(n%100==0 && n%400!=0){
                cnt+=0;
            }
            else{
                cnt +=0;
            }
        }
        System.out.print(cnt);
    }
}