public class NumberofZeroFilledSubarrays {
    public long zeroFilledSubarray(int[] nums) {
        int count = 0;
        long size = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {

                count++;
            } else {
                size += (long) count * (count + 1) / 2;
                count = 0;
            }
        }
        if (count != 0) {
            size += (long) count * (count + 1) / 2;
        }
        return size;
    }
}
