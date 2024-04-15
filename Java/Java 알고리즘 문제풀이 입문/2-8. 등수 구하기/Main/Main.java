import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public int[] solution(int n, int[] inputNumbers) {

        Integer[] arr = Arrays.stream(inputNumbers.clone()).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        List<Integer> rankList = Arrays.stream(arr)
                .mapToInt(Integer::intValue)
                .boxed()
                .collect(Collectors.toList());

        int[] answers = new int[n];

        for(int i = 0; i < n; i++){
            int index = rankList.indexOf(inputNumbers[i]);
            answers[i] = index + 1;
        }

        return answers;
    }

    public int[] solutionLecture(int n, int[] inputNumbers) {
        int[] answer = new int[n];
        for(int i = 0; i<n; i++){
            int cnt = 1;
            for(int j = 0; j < n; j++){
                if(inputNumbers[j] > inputNumbers[i]) cnt++;
            }
            answer[i] = cnt;
        }
        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] inputNumbers = new int[n];
        for(int i = 0; i < n; i++){
            inputNumbers[i] = sc.nextInt();
        }

        sc.close();
        int[] answer = T.solution(n, inputNumbers);
        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

}
