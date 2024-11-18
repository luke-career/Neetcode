import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesinanArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();

        int len = nums.length;
        for (int i = 0; i < len; i++) {

            int t = Math.abs(nums[i]);

            int p = nums[t - 1];

            if (p > 0) {
                nums[t - 1] = -1 * p;
            } else {
                res.add(t);
            }
        }
        return res;
    }
}
