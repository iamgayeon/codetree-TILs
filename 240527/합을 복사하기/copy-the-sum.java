public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d;
        d = a+ b + c ;
        a =d;
        b = d;
        c = d;

        System.out.print(a + " " + b + " " + c);
    }
}