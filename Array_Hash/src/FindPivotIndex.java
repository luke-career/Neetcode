public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int[] sumLeft = new int[nums.length];
        int[] sumRight = new int[nums.length];
        int pre = 0;
        for(int i = 0; i < nums.length; i++){
            sumLeft[i] = pre;
            pre = nums[i] + pre;
        }
        pre = 0;
        for(int i = nums.length -1 ; i >=0; i--){
            sumRight[i] = pre;
            pre = nums[i] + pre;
        }
        int i = 0;
        while( i < nums.length){
            if(sumLeft[i] == sumRight[i]){
                return i;
            }
            i++;
        }
        return -1;

    }
}
