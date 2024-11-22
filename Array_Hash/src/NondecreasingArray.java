public class NondecreasingArray {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i - 1]){
                count++;
                if(count > 1) return false;
                if(i - 2  >= 0 && nums[i - 2] > nums[i] && (i+1 < nums.length-1) && nums[i - 1] > nums[i+1])    {
                    return false;
                }
            }
        }
        return true;
    }
}
