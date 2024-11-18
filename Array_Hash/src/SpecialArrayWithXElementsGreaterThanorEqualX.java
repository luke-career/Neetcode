public class SpecialArrayWithXElementsGreaterThanorEqualX {
    public int specialArray(int[] nums) {
        int len = nums.length;
        int count = 0;
        int res = -1;
        for(int x = 0 ; x <= len; x++){
            count = 0;
            for(int num: nums){
                if (num >= x){
                    count++;
                }
            }
            if(x == count){
                res = x;
            }
        }
        return res;
    }
}
