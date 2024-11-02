public class Task8 {
    public static void main(String[] args) {
        int curYaer = 2017;
        int yearBefore = curYaer - 200;

        do {
            yearBefore = yearBefore + 79;
            System.out.println(yearBefore);
        }
        while (yearBefore < curYaer);

    }
}
