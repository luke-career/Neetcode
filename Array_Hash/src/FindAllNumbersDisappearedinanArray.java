import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            hs.add(nums[i]);
        }

        for(int i = 1; i <= nums.length; i++){
            if(!hs.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}
