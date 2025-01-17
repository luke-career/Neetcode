import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],1) + 1);
        }
        int maxValue = Integer.MIN_VALUE;
        Integer maxKey = null;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > maxValue){
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
}




class Solution3{
    public int majorityElement(int[] nums) {
        int count = 0;
        int majority = 0;
        for(int num: nums){
            if(count == 0){
                majority = num;
            }
            if(num == majority){
                count++;
            }else{
                count--;
            }
        }
        return majority;
    }
}