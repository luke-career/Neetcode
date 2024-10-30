public class isAnagram {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        int[] result = new int[26];
        for(int i = 0 ; i < s1.length; i++){
            int temp = s1[i] - 'a';
            result[temp] += 1;
        }

        for(int i = 0; i < t1.length; i++){
            int temp = t1[i] - 'a';
            result[temp] -= 1;
        }

        for(int i = 0; i < result.length; i++){
            if(result[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
