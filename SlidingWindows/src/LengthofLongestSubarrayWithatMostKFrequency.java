package src;

import java.util.HashMap;

public class LengthofLongestSubarrayWithatMostKFrequency {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int l = 0;
        int r = 0;
        int count = 0;
        while(r < nums.length){
            map.put(nums[r],map.getOrDefault(nums[r],0) + 1);

            while(map.get(nums[r]) > k){
                int temp = map.get(nums[l]);
                int v = temp - 1;
                if(v == 0){
                    map.remove(nums[l]);
                }else{
                    map.put(nums[l],v);
                }
                l++;
            }

            count = Math.max(r - l + 1,count);
            r++;
        }

        return count;
    }
}
