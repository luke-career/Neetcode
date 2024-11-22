package src;

import java.util.HashMap;

public class FruitIntoBaskets {
    public int totalFruit(int[] fruits) {
        int l = 0;
        int r = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;

        while (r < fruits.length) {
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
            while (map.size() > 2) {
                int temp = map.get(fruits[l]) - 1;
                if (temp == 0) {
                    map.remove(fruits[l]);
                } else {
                    map.put(fruits[l], temp);
                }
                l++;
            }
            max = Math.max(max, r - l + 1);
            r++;
        }
        return max;
    }
}
