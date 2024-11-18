import java.util.HashSet;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(hs.contains(nums[i])){
                res[0] = nums[i];
            }
            hs.add(nums[i]);
        }
        for(int i = 1; i <= nums.length; i++){
            if(!hs.contains(i)){
                res[1] = i;
            }
        }
        return res;
    }
}
