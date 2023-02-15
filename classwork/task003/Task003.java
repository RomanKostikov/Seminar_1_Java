
//3. Дана строка. Поменять местами ее половины.
package classwork.task003;

import java.util.Scanner;

public class Task003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        StringBuilder myNewStr = new StringBuilder();
        myNewStr.append(str.substring(str.length() / 2, str.length()))
                .append(str.substring(0, str.length() / 2));
        System.out.println(myNewStr.toString());
        scanner.close();
    }

}