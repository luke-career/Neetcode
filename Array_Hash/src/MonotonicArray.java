public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        boolean increase = true;
        if(nums[right] - nums[left] >= 0){
            increase = true;
        } else {
            increase = false;
        }

        if(increase){
            int pre = nums[0];
            for(int i = 0; i < nums.length; i++){
                if(nums[i] - pre < 0) return false;
                pre = nums[i];
            }
            return true;
        }

        if(!increase){
            int pre = nums[0];
            for(int i = 0; i < nums.length; i++){
                if(nums[i] - pre > 0) return false;
                pre = nums[i];
            }
            return true;
        }

        return false;
    }
}
