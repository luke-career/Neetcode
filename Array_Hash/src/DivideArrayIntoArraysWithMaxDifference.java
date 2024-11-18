import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivideArrayIntoArraysWithMaxDifference {
    public int[][] divideArray(int[] nums, int k) {
        if(nums.length % 3 != 0) {
            return new int[0][0];
        }

        Arrays.sort(nums);
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i + 2 < nums.length; i = i + 3) {
            if (nums[i + 2] - nums[i] <= k) {
                int[] r = new int[] { nums[i], nums[i + 1], nums[i + 2] };
                res.add(r);
            }else{
                return new int[0][0];
            }

        }
        int[][] result = new int[res.size()][];
        for(int i = 0; i < res.size(); i++){
            result[i] = res.get(i);
        }
        return result;
    }
}
