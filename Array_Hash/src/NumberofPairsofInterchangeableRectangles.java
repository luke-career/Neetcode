import java.util.HashMap;

public class NumberofPairsofInterchangeableRectangles {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double, Integer> map = new HashMap<>();
        long count = 0;
        for (int[] res : rectangles) {
            double d = (double) res[0] / res[1];
            if (map.containsKey(d)) {
                count += map.get(d);
            }
            map.put(d, map.getOrDefault(d, 0) + 1);
        }

        return count;

    }
}
