import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a + b;

        String s = Integer.toString(c);
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1')
            count +=1;
        }
        
        
        System.out.print(count);
        


    }
}