import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> textList = new ArrayList<>();
        String input;
        
        // 문자열 입력 받기
        while (!(input = sc.next()).equals("0")) {
            textList.add(input);
        }
        
        // 입력된 문자열 개수 출력
        System.out.println(textList.size());
        
        // 홀수 번째 문자열 출력
        for (int i = 0; i < textList.size(); i += 2) {
            System.out.println(textList.get(i));
        }
    }
}