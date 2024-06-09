import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        List<Integer> answer = T.solution(n, arr);
        for(int i = 0; i < answer.size(); i++){
            System.out.print(answer.get(i) + " ");
        }
    }

    public List<Integer> solution(int n, int[] arr) {
        int[] arr2 = arr.clone();

        Arrays.sort(arr);
        List<Integer> answer = new ArrayList<>();

        for(int i = 0; i < n; i++){
            if(arr[i] != arr2[i]){
                answer.add(i + 1);
            }
        }

        return answer;
    }
}
