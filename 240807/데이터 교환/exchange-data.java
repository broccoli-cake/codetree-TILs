public class Main {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 7;
        int temp1, temp2;
        temp1 = a;
        temp2 = b;
        a = c;
        c = temp2;
        b = temp1;

        System.out.printf("%d\n%d\n%d", a, b, c);

    }
}