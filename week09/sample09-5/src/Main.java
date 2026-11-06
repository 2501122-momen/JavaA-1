import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        final int TEMP = 5;

        Scanner keyboard = new Scanner(System.in);

        int start, end;
        int even = 0;
        int odd = 0;

        // 시작값과 마지막값 입력
        for (; true; ) {

            System.out.print("어디부터 시작할까요 ? ");
            start = keyboard.nextInt();

            System.out.printf(
                    "어디까지 더할까요 ? (최소값 = %d) ",
                    start + TEMP
            );
            end = keyboard.nextInt();

            if (end >= start + TEMP) {
                break;
            } else {
                System.err.printf(
                        "ERROR : 마지막 값은 시작값보다 최소 %d 커야 합니다.\n",
                        TEMP
                );

                System.in.read();
            }
        }

        // 짝수와 홀수의 합 계산
        for (int i = start; i <= end; i++) {

            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }

        // 결과 출력
        System.out.printf(
                "%d ~ %d까지의 합 = %,d\n",
                start, end, even + odd
        );

        System.out.printf(
                "\t짝수의 합 = %,d\n",
                even
        );

        System.out.printf(
                "\t홀수의 합 = %,d\n",
                odd
        );
    }
}