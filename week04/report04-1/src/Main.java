public class Main {
    public static void main(String[] args) {

        int a, b, c;

        a = 3;
        b = 4;

        c = --a + b--;

        System.out.printf("첫 번째 결과 : a = %d, b = %d, c = %d\n",
                a, b, c);

        a = 3;
        b = 4;

        c = a-- + ++b;

        System.out.printf("두 번째 결과 : a = %d, b = %d, c = %d\n",
                a, b, c);
    }
}