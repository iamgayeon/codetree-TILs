import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = sc.next();
        int c1 = 0;
        for(int i=1;i<s.length();i++){
            for(int j=1;j<s1.length();j++)
            if(s.charAt(i-1) == s1.charAt(j-1)&&(s.charAt(i) == s1.charAt(j)))
                c1 +=1;
        }
        if(c1 > 0){
            System.out.print(c1);
        }else{
            System.out.print(-1);
        }
        
    }
}