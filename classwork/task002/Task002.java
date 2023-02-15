//2a. Дана последовательность N целых чисел.
// Найти количество положительных чисел, после которых следует отрицательное число.
package classwork.task002;

// import java.io.*;

// public class Task002 {
//     public static void main(String[] args) throws Exception {
//         BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
//         int[] a = new int[3];
//         int i, j = 0;
//         for (i = 0; i < 3; i++)// creating 3 elements of array
//             a[i] = Integer.parseInt(r.readLine());
//         for (i = 0; i < 3; i++)
//             if (a[i] > 0)
//                 j++;
//         System.out.println(j > 0 ? j : 0);// printing quantity of positive integers or zero
//     }

// }

/*
 * Положительное число
 * Ввести с клавиатуры три целых числа. Вывести на экран количество
 * положительных чисел в исходном наборе.
 * Пример для чисел -4 6 6: 2
 * Пример для чисел -6 -6 -3: 0
 * Требования:
 * 1. Программа должна считывать числа c клавиатуры.
 * 2. Программа должна выводить число на экран.
 * 3. Программа должна выводить количество положительных чисел в исходном
 * наборе.
 * 4. Если положительных чисел нет, программа должна вывести "0".
 */

// 2b. Груповое решение(Евгений)

import java.util.Scanner;

public class Task002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num1 = scanner.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            int num2 = scanner.nextInt();
            if (num1 > 0 && num2 < 0) {
                count++;
            }
            num1 = num2;
        }
        scanner.close();
        System.out.println(count);
    }
}
