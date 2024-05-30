import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int num =0;
        for(int i=0;i<n;i++){
                if(i%2==0){
                    num = i*n+1;
                    for(int j=0;j<n;j++){
                        System.out.print(num +" ");
                        num +=1;
                    }
                }
                else{
                    num = (i+1)*n;
                    for(int j=n;j>0;j--){
                        System.out.print(num +" ");
                        num-=1;
                    }
                
                }
                System.out.println();
            
        
        }
    }
}