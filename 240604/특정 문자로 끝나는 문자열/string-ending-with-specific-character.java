import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];

        

        for(int i=0;i<10;i++){
            arr[i] = sc.next();
        }
        char c = sc.next().charAt(0);
        int j=0;
        int count = 0;
        for(int i=0;i<10;i++){
            j = arr[i].length();
            if(arr[i].charAt(j-1) == c){
                System.out.println(arr[i]);
                count +=1;
            }
        }
        if(count < 1){
            System.out.print("None");
        }

        
    }
}