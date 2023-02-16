package homework.task002;

import java.util.Scanner;

public class Task002 {
    public static void main(String[] args) {
        System.out.printf("Sum:\n%d", summ());
    }

    /**
     * Дана последовательность целых чисел, оканчивающаяся нулем.
     * Найти сумму положительных чисел,
     * после которых следует отрицательное число.
     * 
     * @return сумма
     */
    public static int summ() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numbers:");
        int num1 = scanner.nextInt();
        int sum = 0;
        while (num1 != 0) {
            int num2 = scanner.nextInt();
            if (num1 > 0 && num2 < 0) {
                sum += num1;
            }
            num1 = num2;
        }
        scanner.close();
        return sum;
    }
}
