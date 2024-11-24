public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while(l <= r){
            int mid = l + (r - l) / 2;

            boolean leftSmaller = mid == 0 || nums[mid] > nums[mid - 1];
            boolean rightSmaller = mid == nums.length - 1 || nums[mid] > nums[mid + 1];

            if(leftSmaller && rightSmaller ){
                return mid;
            }else if(!leftSmaller){
                r = mid - 1;
            }else if(!rightSmaller){
                l = mid + 1;
            }
        }
        return -1;
    }
}
