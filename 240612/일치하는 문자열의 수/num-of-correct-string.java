import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int n = sc.nextInt();
        String a = sc.next();
        for(int i=0;i<a.length();i++){
            String b = sc.next();
            if(a.equals(b) == true){
                count+=1;
            }
        }
        System.out.println(count);
    }
}