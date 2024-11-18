public class SortColors {
    public void sortColors(int[] nums) {
        int l = 0;
        int mid = 0;
        int r = nums.length - 1;
        while(mid <= r){
            if(nums[mid] == 0){
                nums[mid] = nums[l];
                nums[l] = 0;
                l++;
                mid++;
            } else if(nums[mid] == 2){
                nums[mid] = nums[r];
                nums[r] = 2;
                r--;
            } else if(nums[mid] == 1){
                mid++;
            }
        }
    }
}
