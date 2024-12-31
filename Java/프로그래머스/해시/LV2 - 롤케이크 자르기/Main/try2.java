import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;

        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        for(Integer t : topping){
            map2.put(t, map2.getOrDefault(t, 0) + 1);
        }

        for(Integer t : topping){
            map1.put(t, map1.getOrDefault(t, 0) + 1);
            map2.put(t, map2.getOrDefault(t, 0) - 1);

            if(map2.get(t) == 0){
                map2.remove(t);
            }

            if(map1.size() == map2.size()){
                answer++;
            }
        }

        return answer;
    }
}