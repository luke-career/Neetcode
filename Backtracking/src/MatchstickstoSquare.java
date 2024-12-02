import java.util.Arrays;

public class MatchstickstoSquare {
    public boolean makesquare(int[] matchsticks) {
        int sum = 0;
        int target = 0;
        for(int stick : matchsticks){
            sum += stick;
        }
        if(sum % 4 != 0){
            return false;
        }
        target = sum / 4;
        int[] sides = new int[4];
        Arrays.sort(matchsticks);
        reverse(matchsticks);

        return  helper(matchsticks,target,0,sides);


    }

    public boolean helper(int[] matchsticks, int target, int index,int[] sides) {
        if (index == matchsticks.length) {
            return sides[0] == target && sides[1] == target && sides[2] == target && sides[3] == target;
        }

        for(int i = 0; i < 4; i++){
            if(sides[i] + matchsticks[index] >  target){
                continue;
            }
            sides[i] += matchsticks[index];
            if(helper(matchsticks,target,index + 1,sides)){
                return true;
            }
            sides[i] -= matchsticks[index];
        }

        return false;
    }


    private void reverse(int[] matchsticks){
        int l = 0;
        int r = matchsticks.length - 1;

        while(l < r){
            int temp = matchsticks[r];
            matchsticks[r] = matchsticks[l];
            matchsticks[l] = temp;
            l++;
            r--;
        }
    }
}
