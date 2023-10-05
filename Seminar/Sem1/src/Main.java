public class Main {
    public static void main(String[] args) {
        Operations op = new Operations();

//        System.out.println(op.add(10, 10));
//        System.out.println(op.sub(10, 10));
//
//        System.out.println(reverse("string"));
//
//        Student st = new Student("Idk", 19);
//        System.out.println(st.toString());

        System.out.println(wordCount(" nu  stiu ce   ec  "));
    }

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
        while (i < sentence.length() && !Character.isLetter(sentence.charAt(i))) {
            i++;
        }

        int result = 0;
        while (i < sentence.length()) {
            while (i < sentence.length() && sentence.charAt(i) == ' ') {
                i++;
            }

            if (i == sentence.length()) {
                break;
            }
            result++;

            while (i < sentence.length() && sentence.charAt(i) != ' ') {
                i++;
            }
        }

        return result;
    }
}