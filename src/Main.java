public class Main {
    public static void main(String[] args) {
        int nachaln = 300;
        int popoln = 1000;

        int itog;
        int bonus;

        if (popoln > 1000) {
            bonus = popoln / 100;
            itog = bonus + nachaln + popoln;
        } else {
            itog = nachaln + popoln;
            bonus = 0;
        }
        System.out.println("Итоговый счёт: " + itog);
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}