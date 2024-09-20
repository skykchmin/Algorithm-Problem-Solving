import java.util.Arrays;
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

        T.solution(n, arr);

    }

    private int[] solution(int n, int[] arr) {
        int[] answer = new int[n];

        for(int i = 0; i < n; i++){
            int idx = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[idx]) idx = j;
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }

        return answer;
    }
}
