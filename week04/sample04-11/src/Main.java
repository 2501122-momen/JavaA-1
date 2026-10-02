public class Main {
    public static void main(String[] args) {

        double a = 1500.35;
        double b = 89.76;

        int sum = (int) (a + b);

        double tax = sum * (10.0 / 100);

        double result = sum - tax;

        System.out.printf("a = %.2f\n", a);
        System.out.printf("b = %.2f\n", b);
        System.out.printf("sum = %d\n", sum);
        System.out.printf("tax = %.2f\n", tax);
        System.out.printf("result = %.2f\n", result);
    }
}