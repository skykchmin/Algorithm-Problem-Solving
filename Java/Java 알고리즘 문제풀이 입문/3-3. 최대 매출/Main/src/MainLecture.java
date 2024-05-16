import java.util.Scanner;

public class MainLecture {
    public static void main(String[] args) {
        MainLecture T = new MainLecture();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        T.solution(n, k, arr);
    }

    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        int sum = 0;

        for(int i = 0; i < k; i++){
            sum += arr[i];
        }

        answer = sum;

        for(int i = k; i < n; i++){
            sum+=(arr[i] - arr[i - k]);
            answer=Math.max(answer, sum);
        }

        return answer;
    }
}
