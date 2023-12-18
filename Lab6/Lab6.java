public class Lab6 {

    public static void main(String[] args) {
        // Завдання 1: Конвертація шістнадцяткового рядка в ціле число
        System.out.println(hexStringToInt("CAFE")); // Очікуваний результат: 51966
        System.out.println(hexStringToInt("1A"));   // Очікуваний результат: 26

        try {
            hexStringToInt(null);  // Очікуваний результат: IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            hexStringToInt("GHI");  // Очікуваний результат: IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Завдання 2: Заміна слів у реченні великими літерами
        String input = "The user with the nickname koala757677 this month wrote 3 times more " +
                "comments than the user with the nickname croco181dile920 4 months ago";
        String result = uppercaseWords(input);
        System.out.println("Result: " + result);
    }

    // Метод для завдання 1: Конвертація шістнадцяткового рядка в ціле число
    public static int hexStringToInt(String s) {
        if (s == null) {
            throw new IllegalArgumentException("The input line must not be null.");
        }

        if (s.isEmpty()) {
            throw new IllegalArgumentException("The input line must not be empty.");
        }

        try {
            return Integer.parseInt(s, 16);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Incorrect hexadecimal number format: " + s);
        }
    }

    // Метод для завдання 2: Заміна слів у реченні великими літерами
    public static String uppercaseWords(String sentence) {
        if (sentence == null) {
            throw new IllegalArgumentException("The input line must not be null.");
        }

        String[] words = sentence.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.matches("[a-zA-Z0-9]+")) {
                result.append(word.toUpperCase()).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }

        return result.toString().trim();
    }
}