import java.util.Arrays;

public class PartitiontoKEqualSumSubsets {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        int target = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % k != 0) {
            return false;
        } else {
            target = sum / k;
        }

        int[] used = new int[k];

        Arrays.sort(nums);
        reverse(nums);

        return helper(nums, k, target, used, 0);

    }

    private boolean helper(int[] nums, int k, int target, int[] used, int index) {
        if (index == nums.length) {
            for (int i = 0; i < k; i++) {
                if (used[i] != target) {
                    return false;
                }
            }
            return true;
        }

        for (int i = 0; i < k; i++) {
            if (used[i] + nums[index] > target)
                continue;

            // if(i > 0 && used[i] == used[i - 1]) continue;
            used[i] += nums[index];
            if (helper(nums, k, target, used, index + 1)) {
                return true;
            }
            used[i] -= nums[index];
        }

        return false;

    }

    private void reverse(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int temp = nums[r];
            nums[r] = nums[l];
            nums[l] = temp;
            l++;
            r--;
        }
    }
}
