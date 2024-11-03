public class Task7 {
    public static void main(String[] args) {
        int fridayMonth = 5;
        int dayMonth = 31;

        do {System.out.println("Сегодня пятница, "+fridayMonth+"-е число. Необходимо подготовить отчет");
            dayMonth = dayMonth-fridayMonth;
            fridayMonth = fridayMonth + 7;
            if (fridayMonth>31){
                break;
            }
        }while (dayMonth > -31);

    }
}
