public class Task6 {
    public static void main(String[] args) {
        int moneyForDeposit = 15000;
        int month = 1;
        int years = 9;
        int allMonth = years*12;

        do {
            moneyForDeposit = moneyForDeposit + moneyForDeposit / 100 * 7;
            month = month+1;
            if (month%6==0){
                System.out.println("Месяц "+month+" накоплений "+moneyForDeposit);
            }
        }
        while (month!=allMonth);
    }
}
