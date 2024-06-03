import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();


        int max = 20;
        int min = 0;
        
        
        if(s1.length() >= min){
            min = s1.length();
        }
        if(s2.length() >= min){
            min = s2.length();
        }

        if(s3.length() >= min){
            min = s3.length();
        }

        if(s1.length() <= max){
            max = s1.length();
        }
        if(s2.length() <= max){
            max = s2.length();
        }

        if(s3.length() <= max){
            max = s3.length();
        }

        System.out.print(min - max);


        


        
    }
}