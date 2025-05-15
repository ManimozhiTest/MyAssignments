package week3.day1;

public class OddIndexUppercase {
    public static void main(String[] args) {
        String test = "changeme”";
        String result = changeOddIndexToUppercase(test);
        System.out.println(result);
    }

    public static String changeOddIndexToUppercase(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (i % 2 != 0) { // odd index
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
