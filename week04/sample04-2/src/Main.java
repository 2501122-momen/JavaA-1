public class Main {
    public static void main(String[] args) {

        int a = Integer.MAX_VALUE;

        long b = a + 1;
        long c = a + 1L;

        System.out.printf("a = %,d\n", a);
        System.out.printf("b = %,d\n", b);
        System.out.printf("c = %,d\n", c);
    }
}