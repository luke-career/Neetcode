import java.util.HashSet;
import java.util.PriorityQueue;

public class SeatReservationManager {

    PriorityQueue<Integer> Pq;
    HashSet<Integer> hs;

    public SeatReservationManager (int n) {
        Pq = new PriorityQueue<>();
        for(int i  = 1 ; i <= n; i++){
            Pq.offer(i);
        }

    }

    public int reserve() {


        return Pq.poll();
    }

    public void unreserve(int seatNumber) {
        Pq.offer(seatNumber);
    }
}
