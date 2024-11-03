public class Task3 {
    public static void main(String[] args) {
        int population = 12_000_000;
        int born = 17;
        int die = 8;
        int year = 1;
        int count_born = 0;
        int count_die = 0;

        while (year < 10) {
            population = population - (population / 1000 * 8);
            population = population + (population / 1000 * 17);
            year = year + 1;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }


    }
}
