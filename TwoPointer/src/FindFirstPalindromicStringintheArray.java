package src;

public class FindFirstPalindromicStringintheArray {
    public String firstPalindrome(String[] words) {
        for (String s : words) {
            if (helper(s))
                return s;
        }
        return "";
    }

    private boolean helper(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
