import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s1 = "";

        for(int i=0;i<n;i++){
            String s = sc.next();
            s1 += s;
        }
       
        int count =1;
        for(int i=0;i<s1.length();i++){
            if(count !=0 && count %5==0){
                System.out.println(s1.charAt(i));
            }else{
                System.out.print(s1.charAt(i));
            }
            count+=1;
        }

        
    }
}