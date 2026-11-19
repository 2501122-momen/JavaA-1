import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int price;
        char member;
        String result;

        System.out.print("구매 금액 입력 : ");
        price = keyboard.nextInt();

        System.out.print("멤버십 회원입니까? (Y/N) : ");
        member = keyboard.next().charAt(0);

        if (price < 0) {
            result = "ERROR";

        } else if (price >= 50000) {
            result = "무료배송 가능";

        } else if ((member == 'Y' || member == 'y') && price >= 30000) {
            result = "무료배송 가능";

        } else {
            result = "무료배송 불가";
        }

        System.out.printf("구매 금액 : %,d원\n", price);
        System.out.printf("배송 결과 : %s\n", result);
    }
}