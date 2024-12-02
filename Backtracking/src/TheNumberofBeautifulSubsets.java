import java.util.ArrayList;

public class TheNumberofBeautifulSubsets {

    int count = 0;

    public int beautifulSubsets(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        helper(nums, k, 0, list);
        return count;

    }

    public void helper(int[] nums, int k, int index, ArrayList<Integer> list) {
        if (!list.isEmpty()) {
            count++;
        }
        if (index == nums.length) {
            return;
        }

        for (int i = index; i < nums.length; i++) {
            boolean isValid = true;
            for (int num : list) {
                if (Math.abs(num - nums[i]) == k) {
                    isValid = false;
                    break;

                }
            }
            if (isValid) {
                list.add(nums[i]);
                helper(nums, k, i + 1, list);
                list.remove(list.size() - 1);
            }

        }
    }
}
