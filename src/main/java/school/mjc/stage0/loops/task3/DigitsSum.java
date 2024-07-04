package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        String numberStr = String.valueOf(Math.abs(t)); // Преобразование числа в строку и учет отрицательных чисел

        for (int i = 0; i < numberStr.length(); i++) {
            sum += numberStr.charAt(i) - '0'; // Вычитание символа '0' преобразует код символа цифры в ее числовое значение
        }

        System.out.println("Сумма цифр числа: " + sum);
    }
}
