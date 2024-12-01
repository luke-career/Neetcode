import java.util.HashMap;
import java.util.PriorityQueue;

public class ReorganizeString {
    public String reorganizeString(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        PriorityQueue<Character> PQ = new PriorityQueue((a, b)-> map.get(b) -  map.get(a));

        PQ.addAll(map.keySet());
        if(map.get(PQ.peek())> (s.length() + 1)/ 2  ) return "";

        StringBuilder sb = new StringBuilder();
        while(PQ.size() > 1){
            char key1 = PQ.poll();
            char key2 = PQ.poll();
            sb.append(key1).append(key2);
            map.put(key1,map.get(key1) - 1);
            map.put(key2,map.get(key2) - 1);
            if(map.get(key1) > 0){
                PQ.offer(key1);
            }

            if(map.get(key2) > 0){
                PQ.offer(key2);
            }
        }

        if(!PQ.isEmpty()){
            char c = PQ.poll();
            sb.append(c);
        }

        return sb.toString();
    }
}
