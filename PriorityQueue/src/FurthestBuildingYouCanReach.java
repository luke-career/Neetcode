import java.util.PriorityQueue;

public class FurthestBuildingYouCanReach {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < heights.length - 1; i++) {
            if (heights[i + 1] - heights[i] > 0) {
                pq.offer(heights[i + 1] - heights[i]);

                if (pq.size() > ladders) {
                    bricks -= pq.poll();

                    if (bricks < 0) {
                        return i;
                    }
                }
            }

        }
        return heights.length -1;
    }
}
