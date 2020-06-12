package homework_3;

public class Task_0 {

    public static void main(String[] args) {
        int money = 0;
        for (int i = 1; i <= 64; i++ ) {
            money += money + money + i;
        }
        System.out.println("К концу года я накоплю " + money);
    }

}