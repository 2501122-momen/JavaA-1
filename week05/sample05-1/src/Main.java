import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int width;
        int height;
        char type;
        int area;
        boolean flag;
        String result;

        System.out.print("사각형의 가로 길이 입력 (예 5) : ");
        width = keyboard.nextInt();

        System.out.print("사각형의 세로 길이 입력 (예 5) : ");
        height = keyboard.nextInt();

        flag = (width > 0 && height > 0) ? true : false;

        type = (width == height) ? '정' : '직';
        area = width * height;

        result = (flag == true)
                ? String.format(
                "**** %c사각형 넓이 ******\n" +
                        "\t가로 길이 : %,d Cm\n" +
                        "\t세로 길이 : %,d Cm\n" +
                        "\t넓이 : %,d \u33A0\n",
                type, width, height, area)
                : "입력 값이 잘못되었습니다.";

        System.out.println(result);
    }
}