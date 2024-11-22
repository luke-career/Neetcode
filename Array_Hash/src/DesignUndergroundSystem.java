import java.util.HashMap;

public class DesignUndergroundSystem {


    private HashMap<Integer,CheckInPoint> checkInMap;

    private HashMap<String,TripPoint> tripMap;

    private class CheckInPoint{
        String startDes;
        int startTime;

        private CheckInPoint(String stationName, int t){
            this.startDes = stationName;
            this.startTime = t;
        }
    }

    private  class TripPoint{
        int count;
        int time;

        private TripPoint(int time){
            this.time = time;
            this.count = 1;
        }
        private void addNewTrip(int time){
            this.time += time;
            count++;
        }

    }


    public DesignUndergroundSystem() {
        checkInMap  = new HashMap<>();
        tripMap = new HashMap<>();

    }

    public void checkIn(int id, String stationName, int t) {
        checkInMap.put(id,new CheckInPoint(stationName,t));
    }

    public void checkOut(int id, String stationName, int t) {
        String startEnd =  checkInMap.get(id).startDes + "#"+ stationName;
        int tripTime = t -  checkInMap.get(id).startTime;
        checkInMap.remove(id);
        if(tripMap.containsKey(startEnd)){
            tripMap.get(startEnd).addNewTrip(tripTime);
        }else{
            tripMap.put(startEnd, new TripPoint(tripTime));
        }

    }

    public double getAverageTime(String startStation, String endStation) {
        String s = startStation + "#"+ endStation;
        int time = tripMap.get(s).time;
        int count = tripMap.get(s).count;
        return (double) time / count;
    }
}
