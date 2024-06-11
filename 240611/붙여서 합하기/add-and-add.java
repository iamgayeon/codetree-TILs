import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        
        String c = a+b;
        String d = b+a;


        int aInt = Integer.parseInt(c)+Integer.parseInt(d);


        System.out.print(aInt);
    }
}