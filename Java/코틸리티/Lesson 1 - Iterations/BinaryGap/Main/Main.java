
import java.util.*;

class Solution {

    static StringBuilder sb = new StringBuilder();

    public void dfs(int N){
        if(N == 1){
            sb.append(1);
            return;
        } else {
            dfs(N / 2);
            int temp = N % 2;
            sb.append(temp);
        }
    }

    public int solution(int N) {

        dfs(N);
        System.out.println(sb.toString());
        String binstr = sb.toString();

        int max = 0;
        int count = 0;

        for(int i = 0; i < binstr.length(); i++){
            if(binstr.charAt(i) == '0'){
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }

        return max;
    }
}


