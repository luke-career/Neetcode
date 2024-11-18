import java.util.*;

public class UniqueLength3PalindromicSubsequence {
    public int countPalindromicSubsequence(String s) {
        HashMap<Character, List<Integer>> map = new HashMap<>();
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, new ArrayList());
            }
            map.get(c).add(i);
        }
        for (Map.Entry<Character, List<Integer>> entry : map.entrySet()) {
            List<Integer> res = entry.getValue();
            if (res.size() > 1) {
                int start = res.get(0);
                int end = res.get(res.size() - 1);
                for(int i = start + 1;  i < end;i++){
                    String r = "" + s.charAt(start) + s.charAt(i) + s.charAt(end);
                    hs.add(r);
                }

            }
        }

        return hs.size();
    }
}
