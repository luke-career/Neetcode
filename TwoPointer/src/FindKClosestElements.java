import java.util.ArrayList;
import java.util.List;

public class FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0;
        int r = arr.length - 1;
        List<Integer> list = new ArrayList<>();
        while(r - l > k-1){
            int temp = Math.abs(arr[r] - x) -  Math.abs(arr[l] - x);
            if(temp >= 0){
                r--;
            }else{
                l++;
            }
        }
        for(int i = l; i <= r; i++){
            list.add(arr[i]);
        }
        return list;
    }
}
