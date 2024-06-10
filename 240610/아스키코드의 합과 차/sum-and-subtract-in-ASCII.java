import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        int sum = (int) a + (int) b;
        System.out.print(sum +" ");
        if(a < b){
            int sum1 = (int)b  - (int) a ;
            System.out.print(sum1);
        }else{
            int sum1 = (int)a  - (int) b ;
            System.out.print(sum1);
        }
        
    }
}