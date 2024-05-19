import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int solution = T.solution(n, k, arr);
        System.out.println(solution);
    }

    public int solution(int n, int k, int[] arr) {

        int answer = 0;
        int lt = 0;
        int rt = 0;

        int sum = 0;
        while(rt < n){
            if(sum == k){
                answer++;

                sum -= arr[lt];

                lt++;
            } else if (sum < k) {
                sum += arr[rt];
                rt++;
            } else if (sum > k) {
                sum -= arr[lt];
                lt++;
            }
        }

        return answer;
    }
}
