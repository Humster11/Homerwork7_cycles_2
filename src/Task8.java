public class Task8 {
    public static void main(String[] args) {
        int curYaer = 2017;
        int yearBefore = curYaer - 200;
        int yearAfter = curYaer + 100;

        for (int i = yearBefore; i < yearAfter; i = i + 79) {
            if (i % 79 == 0 && i!=yearBefore) {
                System.out.println(i);
            }
        }

    }
}
