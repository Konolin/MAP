public class Main {
    public static void main(String[] args) {
        Operations op = new Operations();

        System.out.println(op.add(10, 10));
        System.out.println(op.sub(10, 10));

        System.out.println(reverse("string"));

        Student st = new Student("Idk", 19);
        System.out.println(st.toString());
    }

    public static String reverse(String input) {
        StringBuilder sb = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            char ch = input.charAt(i);
            sb.append(ch);
        }

        return sb.toString();
    }
}