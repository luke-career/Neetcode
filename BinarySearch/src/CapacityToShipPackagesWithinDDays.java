public class CapacityToShipPackagesWithinDDays {
    public int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int sum = 0;
        for(int w : weights){
            max = Math.max(max,w);
            sum += w;
        }

        int l = max;
        int r = sum;

        while(l < r){
            int mid = l + (r - l) / 2;

            if(helper(weights,days,mid)){
                r = mid ;
            }else{
                l = mid + 1 ;
            }
        }
        return l;
    }

    private boolean helper(int[] weights,int days, int weight){
        int countDays = 1;
        int currentWeight = 0 ;

        for(int w : weights){
            currentWeight += w;
            if(currentWeight > weight){
                currentWeight = w;
                countDays++;
            }
        }

        return countDays <= days;
    }
}
