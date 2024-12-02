package src.Solution;

public class FindtheTownJudge {
    public int findJudge(int n, int[][] trust) {
        int res = -1;
        int[] indegree = new int[n + 1];
        int[] outdegree = new int[n + 1];
        for(int i = 0; i < trust.length; i++){
            int a = trust[i][0];
            int b = trust[i][1];

            outdegree[a]++;
            indegree[b]++;
        }

        for(int i = 1; i < n + 1; i++){
            if(indegree[i] == n -1  && outdegree[i] == 0){
                res = i;
            }
        }
        return res;
    }
}
