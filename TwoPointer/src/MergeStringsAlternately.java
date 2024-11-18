package src;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s1 = new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();
        int l1 = 0;
        int l2 = 0;
        while (l1 < len1 && l2 < len2) {
            char a = word1.charAt(l1);
            char b = word2.charAt(l2);
            s1.append(a);
            l1++;
            s1.append(b);
            l2++;
        }
        if (l1 == len1)
            s1.append(word2.substring(l2, len2));
        if (l2 == len2)
            s1.append(word1.substring(l1, len1));

        return s1.toString();
    }
}
