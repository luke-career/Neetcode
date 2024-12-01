import java.util.HashMap;
import java.util.PriorityQueue;

public class LongestHappyString {
    public String longestDiverseString(int a, int b, int c) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (a > 0) {
            map.put('a', a);
        }
        if (b > 0) {
            map.put('b', b);
        }
        if (c > 0) {
            map.put('c', c);
        }

        PriorityQueue<Character> PQ = new PriorityQueue<>((x, y) -> map.get(y) - map.get(x));
        PQ.addAll(map.keySet());
        StringBuilder sb = new StringBuilder();
        while (!PQ.isEmpty()) {
            char first = PQ.poll();

            if (sb.length() >= 2 && sb.charAt(sb.length() - 1) == first && sb.charAt(sb.length() - 2) == first) {
                if (PQ.isEmpty()) {
                    break;
                }
                char second = PQ.poll();
                sb.append(second);
                map.put(second, map.get(second) - 1);
                if (map.get(second) > 0) {
                    PQ.offer(second);
                }
                PQ.offer(first);
            } else {
                sb.append(first);
                map.put(first, map.get(first) - 1);
                if (map.get(first) > 0) {
                    PQ.offer(first);
                }
            }

        }
        return sb.toString();
    }
}
