public class TimeNeededtoBuyTickets {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int i = 0;
        int time = 0;
        while(true){
            if(tickets[k] == 0) break;
            if(tickets[i] == 0){
                i =  (i + 1) % tickets.length;
                continue;
            }

            tickets[i]--;
            time++;
            i =  (i + 1) % tickets.length;
        }
        return time;
    }
}
