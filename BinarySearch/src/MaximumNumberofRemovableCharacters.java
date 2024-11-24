import java.util.HashSet;

public class MaximumNumberofRemovableCharacters {
    public int maximumRemovals(String s, String p, int[] removable) {
        int l = 0;
        int r = removable.length;

        while (l < r) {
            int mid = l + (r - l + 1) / 2;
            if (helper(s, p, removable, mid)) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;

    }

    private boolean helper(String s, String p, int[] removable, int k) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < k; i++) {
            hs.add(removable[i]);
        }

        int r = 0;

        for (int i = 0; i < s.length(); i++) {
            if (hs.contains(i)) {
                continue;
            }
            if (p.charAt(r) == s.charAt(i)) {
                r++;
            }
            if (r == p.length())
                return true;
        }
        return false;
    }

}
