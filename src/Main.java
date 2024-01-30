public class Main {
    public static void main(String[] args) {
        int startingBalance = 300;
        int replenishment = 1000;

        int result;
        int bonus;

        if (replenishment > 1000) {
            bonus = replenishment  / 100;
            result = bonus + startingBalance + replenishment;
        } else {
            result = startingBalance + replenishment;
            bonus = 0;
        }
        System.out.println("Итоговый счёт: " + result);
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}