import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt12 = 0;
        int cnt3 = 0;
        int cnt2 = 0;
        for(int i=1;i<=n;i++){
            if ((i%12==0) && (i%3==0) && (i%2==0)) {

                cnt12 += 1;
            }
            else if ((i%3==0)){
                cnt3 += 1;

            }
            else if (i%2==0){
                cnt2 += 1;
             }
                
            }
        System.out.print(cnt2 + " " + cnt3 + " " +cnt12);
        }

}