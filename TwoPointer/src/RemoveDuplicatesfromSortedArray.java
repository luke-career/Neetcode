package src;

public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int slow = 1;
        int fast = 1;
        int count = 1;
        while(fast < nums.length){

            if(nums[fast] != nums[fast-1]){
                nums[slow] = nums[fast];
                slow++;
                count++;
            }
            fast++;
        }
        return count;
    }
}
