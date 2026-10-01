import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        double celsius;
        double fahrenheit;

        System.out.print("섭씨 온도를 입력하세요 : ");
        celsius = keyboard.nextDouble();

        fahrenheit = celsius * 9 / 5 + 32;

        System.out.printf("화씨 온도 : %.2f ℉\n", fahrenheit);
    }
}