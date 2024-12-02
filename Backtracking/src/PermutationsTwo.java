import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsTwo {
    ArrayList<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);

        ArrayList<Integer> list = new ArrayList<>();

        helper(nums,list, new boolean[nums.length]);

        return res;

    }

    public void helper(int[] nums, ArrayList<Integer> list, boolean[] used){
        if(list.size() == nums.length){
            res.add(new ArrayList(list));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(used[i]){
                continue;
            }

            if( i > 0 && nums[i] == nums[i - 1] && used[i - 1] ) continue;
            if(!used[i]){
                list.add(nums[i]);
                used[i] = true;
            }


            helper(nums,list,used);

            list.remove(list.size() - 1);
            used[i] = false;
        }
    }
}
