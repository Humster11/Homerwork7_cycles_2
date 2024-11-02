public class Task7 {
    public static void main(String[] args) {
        int fridayMonth = 5;
        int dayMonth = 31;

        do {System.out.println(fridayMonth);
            dayMonth = dayMonth-fridayMonth;
            fridayMonth = fridayMonth + 7;
        }while (dayMonth > -31);

    }
}
