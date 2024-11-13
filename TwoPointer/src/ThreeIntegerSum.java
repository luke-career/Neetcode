package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeIntegerSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0 ) break;
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int mid = i + 1;
            int right = nums.length - 1;
            while(mid < right){
                int sum = nums[i] + nums[mid] + nums[right];
                while(mid < right && nums[mid] == nums[mid + 1]){
                    mid++;
                }
                while(mid < right && nums[right] == nums[right - 1]){
                    right--;
                }
                if(sum == 0){
                    res.add(Arrays.asList(nums[i],nums[mid],nums[right]));
                    right--;
                    mid++;
                }else if(sum < 0){
                    mid++;
                }else if(sum > 0){
                    right--;
                }

            }
        }
        return res;
    }
}
