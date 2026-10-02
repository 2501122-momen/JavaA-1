import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int second;
        int day;
        int hour;
        int minute;
        int result;

        System.out.print("원하는 시간을 초단위로 입력 : ");
        second = keyboard.nextInt();

        day = second / (60 * 60 * 24);

        result = second % (60 * 60 * 24);

        hour = result / (60 * 60);

        result = result % (60 * 60);

        minute = result / 60;

        result = result % 60;

        System.out.printf(
                "%,d 초는 %d일 %d시간 %d분 %d초\n",
                second, day, hour, minute, result
        );
    }
}