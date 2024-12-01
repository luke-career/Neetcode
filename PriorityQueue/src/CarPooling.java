import java.util.PriorityQueue;

public class CarPooling {
    public boolean carPooling(int[][] trips, int capacity) {
        PriorityQueue<int[]> Pq = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        for (int i = 0; i < trips.length; i++) {
            int[] trip = trips[i];
            Pq.offer(new int[]{trip[1],trip[0]});
            Pq.offer(new int[]{trip[2], -1 * trip[0]});
        }
        int size = 0;
        while(!Pq.isEmpty()){
            int[] p = Pq.poll();
            size += p[1];
            if(size > capacity){
                return false;
            }
        }
        return true;
    }
}
