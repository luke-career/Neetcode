import java.util.Arrays;

public class BagofTokens {
    public int bagOfTokensScore(int[] tokens, int power) {
        int l = 0;
        int r = tokens.length - 1;
        int score = 0;
        int maxScore = 0;
        Arrays.sort(tokens);

        while(l <= r){
            if(power >= tokens[l]){
                power -= tokens[l];
                score++;
                maxScore = Math.max(maxScore,score);
                l++;
            }else if(power < tokens[l] && score >= 1){
                power += tokens[r];
                score--;
                r--;
            }else{
                break;
            }
        }
        return maxScore;
    }
}
