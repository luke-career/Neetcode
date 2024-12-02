import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    ArrayList<List<String>> res = new ArrayList<>();

    public List<List<String>> partition(String s) {
        ArrayList<String> list = new ArrayList<>();
        helper(s, list, 0);
        return res;
    }

    private void helper(String s, ArrayList<String> list, int index) {
        if (index == s.length()) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < s.length(); i++) {
            String sb = s.substring(index, i + 1);
            if (isPalindrome(sb)) {
                list.add(sb);
                helper(s, list, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
