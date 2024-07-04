package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        String numberStr = Integer.toString(t);
        for (int i = 0; i < numberStr.length(); i++) {
            sum += numberStr.charAt(i) - '0'; // Преобразование символа в числовое значение
        }
        System.out.println(sum);
    }
}
