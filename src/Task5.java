public class Task5 {
    public static void main(String[] args) {
        int moneyForDeposit = 15000;
        int month = 1;

        while (moneyForDeposit < 12_000_000) {
            moneyForDeposit = moneyForDeposit + moneyForDeposit / 100 * 7;
            if (month == 6 || month == 12 || month == 18 || month == 24){
                System.out.println("Месяц "+month+" накоплено денег "+moneyForDeposit);
            }
            month = month + 1;
        }
    }
}
