public class RearrangeArrayElementsbySign {
    public int[] rearrangeArray(int[] nums) {
        int l = 0;
        int r = 1;
        int len = nums.length;
        int[] res = new int[len];

        for(int i = 0; i < len; i++){
            if(nums[i] > 0){
                res[l] = nums[i];
                l += 2;
            }else if( nums[i] < 0){
                res[r] = nums[i];
                r += 2;
            }
        }
        return res;
    }
}
