public class MinimumChangesToMakeAlternatingBinaryString {
    public int minOperations(String s) {
        int len = s.length();
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(int i = 0; i < len; i++){
            if(i % 2 == 0){
                s1.append('0');
            }else{
                s1.append('1');
            }
        }

        for(int i = 0; i < len; i++){
            if(i % 2 == 0){
                s2.append('1');
            }else{
                s2.append('0');
            }
        }

        return Math.min(helper(s,s1.toString()), helper(s,s2.toString()));
    }

    private int helper(String s, String t){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != t.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
