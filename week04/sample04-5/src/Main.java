public class Main {
    public static void main(String[] args) {

        char a = 'A';
        int result = a + 1;

        System.out.printf(
                "a = %c(%d), result = %c(%d)\n",
                a, (int) a, (char) result, result
        );
    }
}