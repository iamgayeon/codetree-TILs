import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int q = sc.nextInt();
        char temp = 0;
        char[] arr = s.toCharArray();

        for(int i=0;i<q;i++){
            int num = sc.nextInt();
            if(num == 1){
                int c1 = sc.nextInt();
                int c2 = sc.nextInt();
                temp = arr[c1-1];
                arr[c1-1] = arr[c2-1];
                arr[c2-1] = temp;

            }else{
                char c3 = sc.next().charAt(0);
                char c4 = sc.next().charAt(0);

                for(int j=0;j<s.length();j++){
                    if(arr[j] == c3){
                        arr[j] = c4;
                    }
                }
            }
            s = String.valueOf(arr);
            System.out.println(s);

        }
        
        
    }
}