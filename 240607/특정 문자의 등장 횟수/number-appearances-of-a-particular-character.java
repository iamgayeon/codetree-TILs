import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int c1 = 0;
        int c2 = 0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1) == 'e' && s.charAt(i)=='e'){
                c1 +=1;
            }
            if(s.charAt(i-1) == 'e' && s.charAt(i)=='b'){
                c2 +=1;
            }
        }
        System.out.print(c1 +" ");
        System.out.print(c2);
    }
}