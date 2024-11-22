package src;

public class SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int s = 1;
        int count = 0;
        while(r < nums.length){
            s *= nums[r];

            while(s >= k && l <= r){
                s = s / nums[l];
                l++;
            }
            count += r - l + 1;
            r++;

        }
        return count;
    }
}
