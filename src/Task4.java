public class Task4 {
    public static void main(String[] args) {
        int moneyForDeposit = 15000;
        int month = 1;

        while (moneyForDeposit < 12_000_000) {
            moneyForDeposit = moneyForDeposit + moneyForDeposit / 100 * 7;
            month = month + 1;
            System.out.println("Месяц "+month+" накоплено денег "+moneyForDeposit);
        }
    }
}
