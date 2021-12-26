public class Main {
    public static void main(String[] args) {
        int currentBalance = 100;
        int transfer = 1100;
        int bonus;
        if (transfer >= 1000) {
            bonus = transfer / 100;
        } else {
            bonus = 0;
        }
        int total;
        total = currentBalance + transfer + bonus;
        System.out.println("Общая сумма = " + total + " руб");
        System.out.println("Количество бонусных рублей = " + bonus);
    }
}
