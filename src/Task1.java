//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Task1 {
    public static void main(String[] args) {
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + 15_000;
            i = i + 1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
        }

    }
}