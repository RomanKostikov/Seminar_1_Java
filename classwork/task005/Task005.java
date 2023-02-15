// 5.	Дан массив целых чисел. Верно ли, что массив является симметричным.
package classwork.task005;

public class Task005 {
    public static void main(String[] args) {
        int[] myArray = { 1, 2, 3, 6, 3, 2, 1 };
        System.out.println(tester(myArray));
    }

    public static String tester(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return "Не симметричный";
            }
        }
        return "Симметричный";
    }

}
