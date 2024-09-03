import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int answer = T.solution(N);

        System.out.println(answer);
    }

    private int solution(int n) {
        int answer = 0;

        int[] dy = new int[n + 1];

        dy[1] = 1;
        dy[2] = 2;

        for(int i = 3; i <= n; i++){
            dy[i] = dy[i - 2] + dy[i - 1];
        }

        answer = dy[n];
        return answer;
    }
}
