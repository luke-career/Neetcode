public class MaximumScoreAfterSplittingaString {
    public int maxScore(String s) {
        int max = -1;
        for(int i = 1; i < s.length(); i++){
            String l =  s.substring(0,i);
            int lValue = 0;
            for(int j = 0; j < l.length();j++){
                if(l.charAt(j) == '0'){
                    lValue++;
                }
            }
            String r =  s.substring(i,s.length());

            int rValue = 0;
            for(int j = 0; j < r.length();j++){
                if(r.charAt(j) == '1'){
                    rValue++;
                }
            }
            max = Math.max(max,lValue+rValue);
        }
        return max;
    }
}
