import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
            sum += arr[i].length();
        }
        int count = 0;

        for(int i=0;i<n;i++){{
                if(arr[i].charAt(0) == 'a'){
                    count +=1;
                }
            }
                
        }

        System.out.print(sum+" ");
        System.out.print(count);
    }
}