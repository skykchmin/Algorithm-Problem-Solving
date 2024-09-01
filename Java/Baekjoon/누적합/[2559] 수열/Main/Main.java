import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int[] arr = new int[A];

        for(int i = 0; i < A; i++){
            arr[i] = sc.nextInt();
        }

        int answer = T.solution(A, B, arr);
        System.out.println(answer);
    }

    private int solution(int A, int B, int[] arr) {
        int[] prefix = new int[A+1];

        for(int i = 0; i < A; i++){
            prefix[i + 1] = prefix[i] + arr[i];
        }

        // 부분 합 배열 생성
        int[] answer = new int[A - B + 1];
        for (int j = B; j <= A; j++) { // B부터 A까지 반복
            answer[j - B] = prefix[j] - prefix[j - B]; // 부분 합 계산
        }

        // 최대 값 계산
        int max = Arrays.stream(answer).max().getAsInt();

        return max;

    }
}
