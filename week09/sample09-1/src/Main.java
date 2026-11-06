import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);

        final int SIZE = 30;
        char answer;
        String result;

        while (true) {

            System.out.print("학생 출석했나요 ? (Yes/No) ");
            answer = keyboard.nextLine().charAt(0);

            if (answer == 'Y' || answer == 'y' ||
                    answer == 'N' || answer == 'n') {

                break;

            } else {

                System.err.print("ERROR : 입력 오류");
                System.in.read();
            }
        }

        if (answer == 'Y' || answer == 'y') {
            result = "출석";
        } else {
            result = "결석";
        }

        System.out.printf("학생은 %s 입니다.\n", result);
    }
}