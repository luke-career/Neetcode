public class GetEqualSubstringsWithinBudget {
    public int equalSubstring(String s, String t, int maxCost) {
        int l = 0;
        int r = 0;
        int cost = 0;
        int maxLength = 0;
        while(r < t.length()){
            cost += Math.abs(s.charAt(r) - t.charAt(r));
            while(cost > maxCost){
                cost -= Math.abs(s.charAt(l) - t.charAt(l));
                l++;
            }
            maxLength = Math.max(maxLength,r - l + 1);
            r++;
        }
        return maxLength == Integer.MAX_VALUE ? 0 : maxLength;
    }
}
