package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        long sum = 0;
        long currentNumber = 0;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            currentNumber = currentNumber * 10 + 9; // Построение числа, состоящего из 9
            sum += currentNumber; // Добавление текущего числа к сумме
        }
        System.out.println(sum);

    }
}
