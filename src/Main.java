public class Main {
    public static void main(String[] args) {
        // Объявляете переменные для входных данных и параметров программы: начального счёта,
        // суммы пополнения и тп:
        int bill = 100;  // первоначальная сумма на счёте
        int replenishment = 2000; // сумма пополнения счёта
        // Условным оператором проверяете превысила ли сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите на экран.
        int limit = (replenishment > 1000) ? 1 : 0;
        int bonus = replenishment / 50 * limit;
        int balance = bill + replenishment + bonus;
        System.out.println("Спасибо за пополнение!:) Твой баланс: " + balance + " руб. Твой бонус: " + bonus + " руб.");
    }
}