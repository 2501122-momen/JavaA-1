public class Main {
    public static void main(String[] args) {

        int totalSecond = 54321;

        int hour;
        int minute;
        int second;

        hour = totalSecond / 3600;
        minute = (totalSecond % 3600) / 60;
        second = totalSecond % 60;

        System.out.printf(
                "%d 초 = %d 시간 %d 분 %d 초\n",
                totalSecond, hour, minute, second
        );
    }
}