// 6. Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
// Return the running sum of nums.
// Дано число массива. Мы определяем текущую сумму массива как runningSum [i] = sum (nums [0]... nums [i]).
// Возвращает текущую сумму чисел.
// Example 1:

// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
package classwork.task006;

import java.util.Scanner;

public class Task006 {
    public static void main(String[] args) {
        System.out.println(runningSum());
    }

    public static String runningSum() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] resArray = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            resArray[i] = sum;
        }
        resArray[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            resArray[i] = arr[i] + resArray[i - 1];
        }
        String res = "Результат:";
        for (int i = 0; i < resArray.length; i++) {
            res += " " + resArray[i];
        }
        sc.close();
        return res;
    }
}
