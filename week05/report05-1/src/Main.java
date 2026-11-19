import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int a, b, c;
        String result;

        System.out.print("첫 번째 정수 입력 : ");
        a = keyboard.nextInt();

        System.out.print("두 번째 정수 입력 : ");
        b = keyboard.nextInt();

        System.out.print("세 번째 정수 입력 : ");
        c = keyboard.nextInt();

        if (a == 0 && b == 0 && c == 0) {
            result = "모두 0";

        } else if (a < 0 || b < 0 || c < 0) {
            result = "음수 포함";

        } else if (a > 0 && b > 0 && c > 0) {
            result = "모두 양수";

        } else {
            result = "0 포함";
        }

        System.out.println("결과 : " + result);
    }
}