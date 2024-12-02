package Solution;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        if(numCourses == 0 || prerequisites.length == 0) return true;
        int[] visited = new int[numCourses];
        int row = prerequisites.length;
        int col = prerequisites[0].length;

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            res.add(new ArrayList<>());
        }

        for (int[] prerequisite : prerequisites) {
            res.get(prerequisite[0]).add(prerequisite[1]);
        }

        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0) {
                if (!helper(res, i, visited)) {
                    return false;
                }
                ;
            }
        }
        return true;

    }

    public boolean helper(List<List<Integer>> res, int i, int[] visited) {
        if (visited[i] == 1) {
            return false;
        }

        if (visited[i] == 2) {
            return true;
        }

        visited[i] = 1;

        List<Integer> list = res.get(i);

        for (int r : list) {
            if (!helper(res, r, visited)) {
                return false;
            }
        }
        visited[i] = 2;
        return true;
    }
}
