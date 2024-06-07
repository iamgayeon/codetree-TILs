import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String target = sc.nextLine();
        
        int index = input.indexOf(target); // 입력 문자열에서 목적 문자열의 첫 번째 등장 위치 찾기
        
        if (index != -1) {
            System.out.println(index); // 목적 문자열이 부분 문자열로 존재하는 경우 시작 인덱스 출력
        } else {
            System.out.println(-1); // 목적 문자열이 부분 문자열로 존재하지 않는 경우 -1 출력
        }
    }
}