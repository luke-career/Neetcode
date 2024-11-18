import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllAnagramsinaString {
    public List<Integer> findAnagrams(String s, String p) {

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map1 = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int len = p.length();
        int l = 0;
        int r = 0;
        while (r < s.length()) {
            char c = s.charAt(r);
            map1.put(c, map1.getOrDefault(c, 0) + 1);
            if ((r - l + 1) == p.length()) {
                if (map1.equals(map)) {
                    res.add(l);
                }
                char g = s.charAt(l);
                map1.put(g, map1.get(g) - 1);
                if (map1.get(g) == 0) {
                    map1.remove(g);
                }
                l++;
            }
            r++;
        }
        return res;
    }
}
