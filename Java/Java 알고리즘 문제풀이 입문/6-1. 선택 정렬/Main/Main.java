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

        int index = 0;
        int temp = 0;
        for(int i = 0; i < n; i++){

        }

        return answer;
    }
}
