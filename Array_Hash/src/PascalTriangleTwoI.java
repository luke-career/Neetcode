import java.util.ArrayList;
import java.util.List;

public class PascalTriangleTwoI {
    public List<Integer> getRow(int rowIndex) {
        int [] pre = new int[0];
        List<List<Integer>> rs = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++){
            ArrayList<Integer> ls = new ArrayList<>();
            int[] res = new int[i + 1];
            for(int j = 0; j< res.length; j++){
                if(j == 0 || j == res.length - 1){
                    res[j] = 1;
                }else {
                    res[j] = pre[j - 1] + pre[j];
                }
                ls.add(res[j]);
            }
            pre = res;
            rs.add(ls);
        }
        return (rs.get(rowIndex));
    }
}
