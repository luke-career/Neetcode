import java.util.HashMap;
import java.util.PriorityQueue;

public class LeastNumberofUniqueIntegersafterKRemovals {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int n = arr[i];
            map.put(n,map.getOrDefault(n,0) + 1);
        }

        PriorityQueue<Integer> PQ = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        PQ.addAll(map.keySet());

        while(k > 0 && !PQ.isEmpty()){
            int temp =   PQ.poll();
            map.put(temp,map.get(temp) - 1);
            if(map.get(temp) > 0){
                PQ.offer(temp);
            }
            k--;
        }
        return PQ.size();
    }
}
