import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int salary;
        int tax;

        System.out.print("당신의 급여 입력 : ");
        salary = keyboard.nextInt();

        if (salary >= 0 && salary <= 300000000) {

            if (salary <= 2000000) {
                tax = 0;

            } else if (salary <= 4000000) {
                tax = (int) ((salary - 2000000) * (10.0f / 100));

            } else if (salary <= 6000000) {
                tax = (int) ((salary - 2000000) * (8.0f / 100));

            } else if (salary <= 20000000) {
                tax = (int) ((salary - 2000000) * (6.0f / 100));

            } else {
                tax = (int) ((salary - 2000000) * (5.0f / 100));
            }

            System.out.printf(
                    "급여액이 %,d 원이면 %,d원의 세금을 납부하세요.\n",
                    salary, tax
            );

        } else {
            System.out.println("급여 입력 오류입니다.");
        }
    }
}