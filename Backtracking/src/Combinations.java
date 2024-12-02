import java.util.ArrayList;
import java.util.List;

public class Combinations {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        helper(n,k,1,list);
        return res;
    }

    public void helper(int n , int k,int index, ArrayList<Integer> list ){

        if(list.size() == k) {
            res.add(new ArrayList(list));
            return;
        }
        for(int i = index ; i <= n; i++){
            list.add(i);
            helper(n,k,i+1,list);
            list.remove(list.size() - 1);
        }
    }
}
