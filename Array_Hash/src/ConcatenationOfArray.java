public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int oldLen = nums.length;
        int newLen = oldLen * 2;
        int[] newArray  = new int[newLen];
        for(int i = 0; i < newLen; i++){
            if(i < oldLen) {
                newArray[i] = nums[i];
            }else{
                newArray[i] = nums[i % oldLen];
            }

        }
        return newArray;

    }
}
