import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        char[] arr = s1.toCharArray();
        char a = arr[1];

        for(int i=0;i<s1.length();i++){
            if(arr[i] == a){
                arr[i] = arr[0];
            }
        }
        s1 = String.valueOf(arr);
        
        System.out.print(s1);

        
    }
}