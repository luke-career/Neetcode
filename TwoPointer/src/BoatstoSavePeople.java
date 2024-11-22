import java.util.Arrays;

public class BoatstoSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l = 0;
        int r = people.length - 1;

        int count = 0;

        while(l <= r){
            int sum = people[r] + people[l];
            if(sum > limit){
                count++;
                r--;
            }else if(sum <= limit){
                count++;
                r--;
                l++;
            }
        }
        return count;
    }
}
