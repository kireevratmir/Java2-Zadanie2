public class Main {
    public static void main(String[] args) {
        int nachaln = 300;
        int popoln = 1490;

        int itog;
        int bonus = popoln / 100;

        if (popoln > 300) {
            itog = bonus + nachaln + popoln;
        } else {
            itog = nachaln + popoln;
        }
        System.out.println("Итоговый счёт: " + itog);
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}