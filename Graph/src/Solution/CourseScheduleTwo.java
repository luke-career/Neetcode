package Solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CourseScheduleTwo {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int[] visited = new int[numCourses];

        for(int i = 0; i < numCourses; i++){
            res.add(new ArrayList<Integer>());
        }

        for(int[] prere : prerequisites){
            res.get(prere[1]).add(prere[0]);
        }

        for(int i = 0; i < res.size();i++){
            if(visited[i] == 0){
                if(!helper(numCourses, res,visited,i, result)){
                    return new int[]{};
                }
            }
        }

        Collections.reverse(result);
        int size = result.size();
        int[] answer = new int[size];
        for(int i = 0; i < size; i++){
            answer[i] = result.get(i);
        }

        return answer;

    }

    private boolean helper(int numCourses, List<List<Integer>> res, int[] visited,int i ,List<Integer> list){
        if(visited[i] == 2 ){
            return true;
        }
        if(visited[i] == 1){
            return false;
        }

        visited[i] = 1;

        for(int r : res.get(i)){
            if(!helper(numCourses,res,visited,r,list)){
                return false;
            }
        }
        visited[i] = 2;

        list.add(i);
        return true;
    }
}
