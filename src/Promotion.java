public class Promotion {

    public static void main(String[] args) {

        int startingBalance = 1000;
        int payment = 1700;

        int bonus = payment > 1000 ? payment / 100 : 0;


        int finalBalance = bonus + startingBalance + payment;

        System.out.println("Количество бонусных рублей: " + bonus);
        System.out.println("Итоговый счёт: " + finalBalance);

    }


}
