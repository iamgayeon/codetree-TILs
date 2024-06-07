import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = sc.next();
        int c1 = 0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1) == s1.charAt(0)&&(s.charAt(i) == s1.charAt(1)))
                c1 +=1;
        }
        System.out.print(c1);
    }
}