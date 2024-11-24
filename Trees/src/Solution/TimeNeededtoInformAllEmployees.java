package Solution;

import java.util.ArrayList;

public class TimeNeededtoInformAllEmployees {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        int len = manager.length;
        ArrayList<Integer>[] res = new ArrayList[len];
        int root = -1;
        for(int i = 0; i < len; i++){
            res[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < manager.length; i++) {
            int temp = manager[i];
            if (temp != -1) {
                res[temp].add(i);
            }else{
                root = i;
            }
        }

        return  dfs(root,res,informTime);
    }

    private int dfs(int employee, ArrayList<Integer>[] res, int[] informTime){
        if(res[employee].isEmpty()) return 0;

        int max = 0;
        for(int i : res[employee]){
            max =  Math.max(dfs(i,res,informTime),max);
        }

        return informTime[employee] + max;
    }
}
