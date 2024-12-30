import java.util.*;
import java.math.*;

public class Main {
    public class Solution {

        static int min = Integer.MAX_VALUE;

        public int solution(int n) {

            dfs(1, 1, n);

            return min;
        }

        public void dfs(int dis, int sum, int n){
            // 거리를 넘었을 경우
            if(dis > n){
                return;
            }

            // 거리가 같을 경우
            if(dis == n){
                min = Math.min(min, sum);
                return;
            }

            //
            if(sum > min){
                return;
            }

            // 앞으로 점프하는 케이스
            dfs(dis + 1, sum + 1, n);

            // 순간 이동하는 케이스
            dfs(dis * 2, sum, n);
        }

    }


}
