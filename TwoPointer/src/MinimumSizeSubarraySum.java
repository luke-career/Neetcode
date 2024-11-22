public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int r = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int count = 0;
        while (r < nums.length) {
            sum += nums[r];
            while (sum >= target) {
                count = r - l + 1;
                min = Math.min(min, count);
                sum -= nums[l];
                l++;
            }

            r++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
