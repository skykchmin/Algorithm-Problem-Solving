import java.util.*;
import java.math.*;

class Solution {
    static int max = Integer.MIN_VALUE;
    static int len;

    public int solution(int k, int[][] dungeons) {
        len = dungeons.length;

        dfs(0, k, dungeons, 1);

        return max;
    }

    public void dfs(int depth, int sum, int[][] dungeons, int count){
        // 최소 피로도가 현재보다 클 경우
        if(dungeons[depth][0] > sum){
            max = Math.max(count, max);
            return;
        }

        // 끝까지 갔을 경우 
        if(len == depth){
            max = Math.max(count, max);
            return;
        }

        if(sum - dungeons[depth][1] > 0){
            dfs(depth + 1, sum -= dungeons[depth][1], dungeons, count + 1);
        }

        dfs(depth + 1, sum, dungeons, count);
    }

    public static void main(String[] args) {
        Solution T = new Solution();

        int[][] dungeon = {
                {80, 20},
                {50, 40},
                {30, 10}
        };
        T.solution(80, dungeon);
    }
}