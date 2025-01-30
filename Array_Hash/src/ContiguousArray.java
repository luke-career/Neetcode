import java.util.HashMap;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        int pre = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                pre--;
            }else{
                pre++;
            }
            if(map.containsKey(pre)){

                max = Math.max(i - map.get(pre),max);
            }else{
                map.put(pre,i);

            }
        }
        return max;
    }
}
