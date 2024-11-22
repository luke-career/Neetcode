public class SumofAbsoluteDifferencesinaSortedArray {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int len = nums.length;


        int[] prev = new int[len];
        int [] after = new int[len];
        int[] res = new int[len];

        int l = 0;
        for(int i = 0; i < len; i++){
            prev[i] = l;
            l = l + nums[i];
        }
        int r = 0;
        for(int i = len - 1; i >= 0;i--){
            after[i] = r;
            r = r+ nums[i];
        }

        for(int i = 0; i < len; i++){
            int leftSum = i * nums[i] - prev[i] ;
            int rightSum = after[i] - (len - i - 1) * nums[i];
            res[i] = leftSum + rightSum;
        }
        return res;
    }
}
