import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);

        int first;
        int last;
        int total;
        char answer;
        String result;

        while (true) {

            total = 0;

            // شروع و پایان را دریافت می‌کنیم
            while (true) {

                System.out.print("어디부터 시작 할까요 ? ");
                first = keyboard.nextInt();

                System.out.print("어디까지 더할까요 ? ");
                last = keyboard.nextInt();

                if (first <= last) {
                    break;
                } else {
                    System.err.println("ERROR : 입력 오류");
                }
            }

            // first تا last را با هم جمع می‌کنیم
            for (int i = first; i <= last; i++) {
                total += i;
            }

            // شکل خروجی را با توجه به تعداد عددها تعیین می‌کنیم
            if (first == last) {

                result = String.format(
                        "%d = %,d\n",
                        first, total
                );

            } else if (last - first == 1) {

                result = String.format(
                        "%d + %d = %,d\n",
                        first, last, total
                );

            } else {

                result = String.format(
                        "%d + %d + ... + %d + %d = %,d\n",
                        first, first + 1, last - 1, last, total
                );
            }

            System.out.println(result);

            // nextInt بعدش Enter را باقی می‌گذارد
            keyboard.nextLine();

            // ادامه دادن یا پایان
            while (true) {

                System.out.print("계속할까요 ? (Yes/No) ");
                answer = keyboard.nextLine().charAt(0);

                if (answer == 'Y' || answer == 'y' ||
                        answer == 'N' || answer == 'n') {

                    break;

                } else {

                    System.err.println("ERROR : 입력 오류");
                }
            }

            if (answer == 'N' || answer == 'n') {
                break;
            }
        }

        System.out.println("프로그램을 종료합니다.");
    }
}