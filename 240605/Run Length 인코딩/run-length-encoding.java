import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String run = "";

        char c = s.charAt(0);
        int count =1;

        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == c){
                count +=1;
            }
            else{
                run += c;
                run += Integer.toString(count);

                c = s.charAt(i);
                count =1;

            }
        }
        run += c;
        run += Integer.toString(count);
        
        System.out.println(run.length());
        System.out.print(run);
        
    }
}