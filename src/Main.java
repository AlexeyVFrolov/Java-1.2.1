public class Main {
    public static void main(String[] args) {
        int Current_balance = 2_000_000_000;
        int Transfer_amount = 500_000_000;
        int Total_amount = Current_balance + Transfer_amount;
        System.out.println(String.format("Итоговое значение счета клиента, рублей: %s", Total_amount));
    }
}
