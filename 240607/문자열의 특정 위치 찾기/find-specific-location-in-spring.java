import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        int index = -1;

        for(int i=0;i <s.length();i++){
            if(s.charAt(i) == c){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.print("No");
        }else{
            System.out.print(index);
        }
    }
}