import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        
        char[] arr = s.toCharArray();
        char a = arr[0];
        char b = arr[1];

        for(int i=0;i<s.length();i++){
            if(arr[i] == b){
                arr[i] = a;
            }

            else if(arr[i] == a){
                arr[i] = b;
            }
        }

        for(int i=0;i<s.length();i++){
           System.out.print(arr[i]);
        }




        
    }
}