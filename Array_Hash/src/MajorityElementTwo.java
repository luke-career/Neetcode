import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementTwo {
    public List<Integer> majorityElement(int[] nums) {
        int len = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0) + 1 );
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int k = entry.getKey();
            int v = entry.getValue();
            if( v > len / 3){
                list.add(k);
            }
        }
        return list;

    }
}
