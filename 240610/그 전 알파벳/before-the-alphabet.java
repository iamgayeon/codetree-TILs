import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char num = sc.next().charAt(0);
        if(num == 'a'){
            System.out.print('z');
        }else{
            num = (char)num;
            System.out.print((char)(num-1));
        }
        
    }
}