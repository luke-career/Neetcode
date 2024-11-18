import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        int [] pre = new int[0];
        for(int i = 0; i < numRows; i++){
            int[] res = new int[i + 1];
            ArrayList<Integer> ls = new ArrayList();
            for(int j = 0; j< res.length; j++){
                if(j == 0 ||  j == res.length - 1){
                    res[j] = 1;
                }else{
                    res[j] = pre[j - 1] + pre[j];
                }
                ls.add(res[j]);
            }
            pre = res;
            result.add(ls);
        }
        return result;
    }
}
