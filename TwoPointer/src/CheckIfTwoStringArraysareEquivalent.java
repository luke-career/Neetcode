package src;

public class CheckIfTwoStringArraysareEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(String s : word1){
            s1.append(s);
        }
        for(String s : word2){
            s2.append(s);
        }
        char[] r1 = s1.toString().toCharArray();
        char[] r2 = s2.toString().toCharArray();
        if(r1.length != r2.length) return false;
        for(int i = 0; i < r1.length; i++){
            if(r1[i] != r2[i]){
                return false;
            }
        }
        return true;
    }
}
