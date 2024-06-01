import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] word = new int[n];
        int count =0;

        for(int i=0;i<n;i++){
            word[i] = sc.nextInt();
            if(word[i] == m){
                count +=1;
            }
        }

        System.out.print(count);

        
    }
}