import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        double weight;
        double moon;

        System.out.print("당신의 몸무게를 입력하세요 : ");
        weight = keyboard.nextDouble();

        moon = weight * 0.165;

        System.out.printf("지구에서의 몸무게 : %.2f Kg\n", weight);
        System.out.printf("달에서의 몸무게 : %.2f Kg\n", moon);
    }
}