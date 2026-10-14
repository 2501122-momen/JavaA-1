import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int sales;
        int amount;
        int tax;

        System.out.print("판매금액을 입력하세요 : ");
        sales = keyboard.nextInt();

        amount = (int) (sales / 1.1);
        tax = sales - amount;

        System.out.printf("판매금액 : %,d원\n", sales);
        System.out.printf("금액 : %,d원\n", amount);
        System.out.printf("세금 : %,d원\n", tax);
    }
}