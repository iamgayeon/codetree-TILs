import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;

        int a = sc.nextInt();
        int[] arr1 = new int[a];

        int b = sc.nextInt();
        int[] arr2 = new int[b];

        for(int i=0;i<a;i++){
            arr1[i] = sc.nextInt();
        }

        for(int j=0;j<b;j++){
            arr2[j] = sc.nextInt();
        }

        for(int i=0;i<a-3;i++){
            for(int j=0;j<b-3;j++){
                if(arr1[i] == arr2[j]){
                    if(arr1[i+1] == arr2[j+1]){
                        if(arr1[i+2] == arr2[j+2]){
                            cnt +=1;
                        }
                    }
                }
            }
        }

        if(cnt > 0){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }

        
    }
}