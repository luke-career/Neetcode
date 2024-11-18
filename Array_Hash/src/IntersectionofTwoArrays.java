import java.util.HashSet;

public class IntersectionofTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> rs = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            hs.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (hs.contains(nums2[i])) {
                rs.add(nums2[i]);
            }
        }

        int len = rs.size();
        int[] res = new int[len];
        int index = 0;
        for (int i : rs) {
            res[index] = i;
            index++;
        }
        return res;
    }
}
