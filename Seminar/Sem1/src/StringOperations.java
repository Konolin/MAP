public class StringOperations {
    public static String reverse(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            char ch = input.charAt(i);
            sb.append(ch);
        }
        return sb.toString();
    }

    public static int wordCount(String sentence) {
        int i = 0;
        // skip non-letters
        while (i < sentence.length() && !Character.isLetter(sentence.charAt(i))) {
            i++;
        }
        int result = 0;
        while (i < sentence.length()) {
            // skip letters
            while (i < sentence.length() && sentence.charAt(i) == ' ') {
                i++;
            }
            // end of string
            if (i == sentence.length()) {
                break;
            }
            result++;
            // go to next space
            while (i < sentence.length() && sentence.charAt(i) != ' ') {
                i++;
            }
        }
        return result;
    }
}
