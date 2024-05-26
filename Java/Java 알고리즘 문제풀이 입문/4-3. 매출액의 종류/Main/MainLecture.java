import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MainLecture {

    public static void main(String[] args) {
        MainLecture T = new MainLecture();
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

    public List<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < k - 1; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int lt = 0;

        for(int rt = k - 1; rt < n; rt++){
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if(map.get(arr[lt]) == 0){
                map.remove(arr[lt]);
            }

            lt++;
        }

        return answer;

    }
}
