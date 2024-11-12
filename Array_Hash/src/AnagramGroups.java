import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;


public class AnagramGroups {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<String,List<String>>();
        for(String s: strs){
            char[] s1 = s.toCharArray();
            Arrays.sort(s1);
            String sorted = new String(s1);
            map.putIfAbsent(sorted,new ArrayList<String>());
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
