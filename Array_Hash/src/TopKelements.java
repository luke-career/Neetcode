import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Sorting
public class TopKelements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        ArrayList<int[]> result = new ArrayList();
        for(Map.Entry<Integer,Integer> res : map.entrySet()){
            int[] temp = new int[]{res.getValue(),res.getKey()};
            result.add(temp);
        }
        result.sort((a,b)->b[0] - a[0]);
        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = result.get(i)[1];
        }
        return res;
    }
}


//Heap

