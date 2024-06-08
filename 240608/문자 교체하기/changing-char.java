import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String s1 = sc.next();

        char[] arr = s.toCharArray();
        char[] arr1 = s1.toCharArray();

        for(int i=0;i<2;i++){
            arr1[i] = arr[i];
        }

        for(int i=0;i<s1.length();i++){
           System.out.print(arr1[i]);
        }




        
    }
}