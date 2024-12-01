import java.util.PriorityQueue;

public class FindtheKthLargestIntegerintheArray {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> PQ  = new PriorityQueue<>((a, b) -> {
            if(a.length() < b.length()){
                return 1;
            }else if(a.length() > b.length()){
                return -1;
            }else {
                return b.compareTo(a);
            }
        });

        for(String num : nums){
            PQ.offer(num);
        }
        String res = null;
        while(k > 0){
            res   =  PQ.poll();
            k--;
        }

        return res;
    }
}
