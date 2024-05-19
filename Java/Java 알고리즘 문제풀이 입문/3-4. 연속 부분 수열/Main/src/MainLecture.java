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

        int solution = T.solution(n, k, arr);
        System.out.println(solution);
    }

    private int solution(int n, int k, int[] arr) {
        int answer = 0;
        int sum = 0;
        int lt = 0;

        for(int rt = 0; rt < n; rt++){
            sum+=arr[rt];
            if(sum == k){
                answer++;
                while (sum >= k){
                    sum -= arr[lt++];
                    if(sum == k){
                        answer++;
                    }
                }
            }
        }


        return answer;
    }
}
