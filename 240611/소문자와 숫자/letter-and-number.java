import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char b = s.charAt(i);
            if(Character.isUpperCase(b)){
            // Character.isUpperCase() : 대문자 인지 확인
                answer += Character.toLowerCase(b) ;
                // Character.toLowerCase() : 소문자 변환
            }else if(Character.isLowerCase(b)) {
                answer += Character.toLowerCase(b);
                // Character.toLowerCase() : 대문자 변환
            }else if(b >= '0' && b<='9'){
                answer+= b;
            }
        }
        
        // 결과 출력
        System.out.print(answer);
    }
}