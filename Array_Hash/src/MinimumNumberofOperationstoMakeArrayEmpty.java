import java.util.HashMap;
import java.util.Map;

public class MinimumNumberofOperationstoMakeArrayEmpty {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int v = entry.getValue();
            if (v == 1)
                return -1;
            count += v / 3;
            if (v % 3 != 0) {
                count++;
            }
        }
        return count;
    }
}
