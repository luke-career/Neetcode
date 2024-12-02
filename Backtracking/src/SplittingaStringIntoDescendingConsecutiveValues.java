public class SplittingaStringIntoDescendingConsecutiveValues {
    public boolean splitString(String s) {

        return helper(s,0, -1 ,0);
    }

    public boolean helper(String s,int index,long pre,int count){

        if(index == s.length()) return count > 1;
        long number = 0;
        for(int i = index; i < s.length(); i++){
            number = 10 * number + s.charAt(i) - '0';
            if(pre == -1 || pre - number == 1){
                if(helper(s, i + 1,number,count + 1)){

                    return true;
                }
            }
        }
        return false;
    }
}
