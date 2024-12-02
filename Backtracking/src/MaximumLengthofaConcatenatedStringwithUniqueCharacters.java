import java.util.List;

public class MaximumLengthofaConcatenatedStringwithUniqueCharacters {
    public int maxLength(List<String> arr) {

        return helper(arr, 0, "");
    }

    private int helper(List<String> arr, int index, String sb) {

        if (!isUnique(sb)) {
            return 0;
        }
        if (index == arr.size()) {
            return sb.length();
        }

        int l = helper(arr, index + 1, sb + arr.get(index));
        int r = helper(arr, index + 1, sb);

        return Math.max(l, r);

    }

    private boolean isUnique(String s) {
        int[] res = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            res[c - 'a'] += 1;
            if (res[c - 'a'] > 1) {
                return false;
            }
        }
        return true;
    }
}
