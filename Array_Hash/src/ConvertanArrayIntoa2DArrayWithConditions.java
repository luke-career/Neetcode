import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertanArrayIntoa2DArrayWithConditions {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }


        List<List<Integer>> res = new ArrayList<>();
        while (true) {
            List<Integer> list = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int k = entry.getKey();

                int v = entry.getValue();

                if (v != 0) {
                    list.add(k);
                    map.put(k, v - 1);


                }
            }
            if (list.isEmpty()) {

                break;
            }
            res.add(list);
            
        }
        return res;
    }
}
