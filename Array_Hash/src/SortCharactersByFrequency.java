import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pq.addAll(map.entrySet());

        StringBuilder s1 = new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character,Integer> r = pq.poll();
            s1.append(String.valueOf(r.getKey()).repeat(r.getValue()));
        }

        return s1.toString();
    }
}
