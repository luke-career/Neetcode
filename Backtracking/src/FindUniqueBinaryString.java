import java.util.HashSet;

public class FindUniqueBinaryString {
    public String findDifferentBinaryString(String[] nums) {
        HashSet<String> hs = new HashSet<>();

        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        StringBuilder sb = new StringBuilder();

        return helper(nums, sb, n, hs);

    }

    private String helper(String[] nums, StringBuilder sb, int n, HashSet<String> hs) {
        if (sb.length() == n) {
            if (!hs.contains(sb.toString())) {
                return sb.toString();
            } else {
                return null;
            }
        }

        sb.append("0");
        String result = helper(nums, sb, n,hs);
        if (result != null)
            return result;
        sb.setLength(sb.length() - 1);
        sb.append("1");
        result = helper(nums, sb, n,hs);
        if (result != null)
            return result;
        sb.setLength(sb.length() - 1);
        return null;
    }
}
