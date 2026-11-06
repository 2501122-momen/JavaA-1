import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int num1, num2, num3;
        int result;

        System.out.print("정수 3개 입력 : ");

        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        num3 = keyboard.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                result = num1;
            } else {
                result = num3;
            }
        } else if (num2 > num3) {
            result = num2;
        } else {
            result = num3;
        }

        System.out.printf("가장 큰 수 : %d\n", result);
    }
}