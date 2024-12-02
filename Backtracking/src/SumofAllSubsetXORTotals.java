public class SumofAllSubsetXORTotals {
    int sum = 0;
    public int subsetXORSum(int[] nums) {
        helper(nums,0,0);
        return sum;
    }

    public void helper(int[] nums,int index, int currentXor){
        if(index == nums.length){
            sum += currentXor;
            return;
        }
        helper(nums,index + 1,currentXor);
        helper(nums,index + 1,currentXor ^ nums[index]);

    }
}
