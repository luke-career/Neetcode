public class SquaresofaSortedArray {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int len = nums.length;
        int[] result = new int[len];
        int index = nums.length - 1;

        while(l <= r){
            int temp1 = nums[l] * nums[l];
            int temp2 = nums[r] * nums[r];
            if(temp1 >= temp2){
                result[index] = temp1;
                l++;

            }else if(temp1 < temp2){
                result[index] = temp2;
                r--;
            }
            index--;
        }
        return result;
    }
}
