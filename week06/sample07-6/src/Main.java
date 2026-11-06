import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int man1, man2;
        String result;

        System.out.print("첫번째 선수 입력 (가위 - 1, 바위 - 2, 보 - 3) : ");
        man1 = keyboard.nextInt();

        System.out.print("두번째 선수 입력 (가위 - 1, 바위 - 2, 보 - 3) : ");
        man2 = keyboard.nextInt();

        switch (man1 - man2) {

            case 0:
                result = "비겼습니다.";
                break;

            case -1:
            case 2:
                result = "두번째 선수가 이겼습니다.";
                break;

            case -2:
            case 1:
                result = "첫번째 선수가 이겼습니다.";
                break;

            default:
                result = "입력 오류입니다.";
                break;
        }

        System.out.println(result);
    }
}