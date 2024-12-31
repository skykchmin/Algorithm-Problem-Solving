import java.util.*;

public class try1 {

        public static void main(String[] args) {
            try1 T = new try1();

            int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};

            int answer = T.solution(topping);
            System.out.println(answer);
        }

        public int solution(int[] topping) {
            int answer = 0; // 방법의 수

            Map<Integer, Integer> map1 = new HashMap<>();
            Map<Integer, Integer> map2 = new HashMap<>();

            for(int i = 0; i < topping.length; i++){
                map2.put(topping[i], map2.getOrDefault(topping[i], 0) + 1);
            }

            for(int i = 0; i < topping.length; i++){
                if(map1.size() == map2.size()){
                    answer++;
                }

                map1.put(topping[i], map1.getOrDefault(topping[i], 0) + 1);
                map2.put(topping[i], map2.getOrDefault(topping[i], 0) - 1);

                Iterator<Map.Entry<Integer, Integer>> iterator = map2.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry<Integer, Integer> entry = iterator.next();
                    if (entry.getValue() == 0) {
                        iterator.remove();
                    }
                }
            }

            return answer;
        }
    }

