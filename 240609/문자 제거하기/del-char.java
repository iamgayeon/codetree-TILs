import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        while(true){
            int n = sc.nextInt();
            if(s.length() <= n){
                s = s.substring(0,s.length()-1);
                System.out.println(s);

            }else{
                s = s.substring(0,n) + s.substring(n+1, s.length());
                System.out.println(s);
            }
            if(s.length() == 1){
                break;
            }
        }
    }
}