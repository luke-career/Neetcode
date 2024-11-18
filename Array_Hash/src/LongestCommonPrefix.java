public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int minSize = strs[0].length();
        for(String s : strs){
            minSize = Math.min(minSize,s.length());
        }

        int j = 0;
        while(j < minSize ){
            for(int i = 0; i < strs.length;i++){
                if(strs[i].charAt(j) != strs[0].charAt(j)){
                    return strs[0].substring(0,j);
                }
            }
            j++;
        }
        return strs[0].substring(0,j);
    }
}
