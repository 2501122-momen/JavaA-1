public class Main {
    public static void main(String[] args) {

        final int MONEY = 100000000;

        int life = MONEY;
        int month = 1;

        for (; true; month++) {

            life -= 2000000;

            if (month % 12 == 0) {
                life = (int) (life + (life * (5 / 100.0f)));
            }

            if (life <= 0) {
                break;
            }

            System.out.printf(
                    "%d개월 후 원금 : %,11d원\n",
                    month, life
            );
        }

        System.out.printf(
                "%d 개월까지 살수가 있네요.\n",
                month
        );
    }
}