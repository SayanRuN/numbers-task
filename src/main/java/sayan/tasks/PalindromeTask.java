package sayan.tasks;

public class PalindromeTask {
    public static Boolean palindrome(String pal) {
        if (pal == null || pal.isEmpty()) {
            return null;
        }
        char[] letters = pal.toCharArray();
        int left = 0;
        int right = letters.length - 1;
        while (left < right) {
            if (letters[left] != letters[right]) {
                return false;
            }
            left++;
            right--;
            if (letters[left] == ' ' || letters[left] == ',' || letters[left] == '\'') {
                left++;
            }
            if (letters[right] == ' ' || letters[right] == ',' || letters[right] == '\'') {
                right--;
            }
        }
        return true;
    }
}