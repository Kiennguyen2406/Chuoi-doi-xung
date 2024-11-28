public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        if(input == null) {
            throw new IllegalArgumentException("Chuoi khong duoc null");
        }

        String processed = input.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = processed.length() - 1;

        while (left < right) {
            if (processed.charAt(left) != processed.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    }

