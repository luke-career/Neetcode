public class ReplaceElementsWithGreatestElementOnRightSide {
    public int[] replaceElements(int[] arr) {
        int r = arr.length ;
        int preMax = -1;
        for(int i = r - 1 ; i >= 0; i--){
            int prev = arr[i];
            arr[i] = preMax;
            preMax = Math.max(prev,arr[i]);
        }
        return arr;
    }
}
