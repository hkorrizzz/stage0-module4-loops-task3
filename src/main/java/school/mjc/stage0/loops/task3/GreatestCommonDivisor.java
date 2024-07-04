package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first == 0 || second == 0) {
            return;
        }

        first = Math.abs(first);
        second = Math.abs(second);

        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
        }

        System.out.println("Наибольший общий делитель: " + first);
    }
}
