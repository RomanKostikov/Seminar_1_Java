package homework.task001;

public class Task001 {
    public static void main(String[] args) {
        System.out.println(reverseWords(" the sky is  blue "));
    }

    /**
     * Учитывая входную строку s, измените порядок слов на противоположный.
     * 
     * @param s
     * @return перевернутая строка
     */
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder(words.length);
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].length() != 0) {
                if (result.length() != 0) {
                    result.append(" ");
                }
                result.append(words[i]);
            }
        }

        return result.toString();
    }
}
