import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> countMap = new HashMap<>();

        // 각 숫자의 등장 횟수를 세기
        for (int i = 0; i < n; i++) {
            countMap.put(arr[i], countMap.getOrDefault(arr[i], 0) + 1);
        }

        int maxUnique = -1;

        // 등장 횟수가 한 번인 숫자 중 최대값 찾기
        for (int key : countMap.keySet()) {
            if (countMap.get(key) == 1) {
                if (key > maxUnique) {
                    maxUnique = key;
                }
            }
        }

        System.out.println(maxUnique);
    }
}