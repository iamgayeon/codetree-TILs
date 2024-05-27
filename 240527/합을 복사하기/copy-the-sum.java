public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        a = a + b + c;
        b = a + b + c;
        c = a + b + c;

        System.out.printf(a + '' + b + '' + c);
    }
}