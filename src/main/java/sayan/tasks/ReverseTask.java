package sayan.tasks;

public class ReverseTask {
    public static String reverse(String numeral) {
        if (numeral == null || numeral.isEmpty()) {
            return "0";
        }
        String whole = "";
        for (int a = numeral.length(); a > 0; a--) {
            char word = numeral.charAt(a - 1);
            whole = whole.concat(String.valueOf(word));
            if (whole.startsWith("0")) {
                whole = whole.substring(1);
            }
        }
        return whole;
    }
}