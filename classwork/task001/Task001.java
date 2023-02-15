//1. Если задано целое число n, возвращает разность между произведением его цифр и суммой его цифр.
package classwork.task001;

import java.util.Scanner;

public class Task001 {
    public static void main(String[] args) {
        try (Scanner iScanner = new Scanner(System.in)) {
            int n = iScanner.nextInt();
            int sum = 0;
            int pr = 1;
            while (n != 0) {
                pr *= n % 10;
                sum += n % 10;
                n /= 10;
            }
            System.out.println(pr - sum);
        }
    }
}