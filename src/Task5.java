public class Task5 {
    public static void main(String[] args) {
        int moneyForDeposit = 15000;
        int month = 1;

        while (moneyForDeposit < 12_000_000) {
            moneyForDeposit = moneyForDeposit + moneyForDeposit / 100 * 7;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " накоплено денег " + moneyForDeposit);
            }
            month = month + 1;
        }
    }
}
