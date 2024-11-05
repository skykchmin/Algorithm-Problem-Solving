import java.util.*;

public class Main {
    class Solution {
        public int solution(String[][] clothes) {
            int answer = 0;

            HashMap<String, Integer> map = new HashMap<>();

            for(int i = 0; i < clothes.length; i++){
                String kind = clothes[i][1];

                map.put(kind, map.getOrDefault(kind, 0) + 1);
            }

            // key만큼
            for (int count : map.values()) {
                answer *= (count + 1); // 종류 + 옷을 안입는 경우
            }

            answer -= 1;

            return answer;
        }
    }
}
