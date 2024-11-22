import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindtheDifferenceofTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList();
        HashSet<Integer> hs1 = new HashSet();
        HashSet<Integer> hs2 = new HashSet();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        for (int i = 0; i < nums1.length; i++) {
            hs1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            hs2.add(nums2[i]);
        }
        for (int i : hs1) {
            if (!hs2.contains(i)) {
                list.get(0).add(i);
            }
        }
        for (int i : hs2) {
            if (!hs1.contains(i)) {
                list.get(1).add(i);
            }
        }
        return list;
    }
}
