import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] input = new int[a];

        for(int i = 0; i < a; i++){
            input[i] = sc.nextInt();
        }

        List<Integer> answer = T.solution(a, b, input);
        for (Integer integer : answer) {
            System.out.print(integer + " ");
        }
    }

    public List<Integer> solution(int n, int k, int[] input) {
        List<Integer> answer = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        // 초기 값 세팅
        for(int i = 0; i < k; i++){
            map.put(input[i], map.getOrDefault(input[i], 0) + 1);
        }

        answer.add(map.keySet().size());

        int lp = 0;

        for(int j = k; j < n; j++){
            map.put(input[j], map.getOrDefault(input[j], 0) + 1);

            if(map.containsKey(input[lp])){
                if(map.get(input[lp]) == 1){
                    map.remove(input[lp]);
                } else {
                    map.put(input[lp], map.get(input[lp]) - 1);
                }
                lp++;
            } else {
                map.remove(input[lp]);
                lp++;
            }

            answer.add(map.keySet().size());
        }

        return answer;

    }
}
