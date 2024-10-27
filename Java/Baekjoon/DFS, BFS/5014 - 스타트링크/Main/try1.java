import java.util.Scanner;

public class try1 {

    static int F, S, G, U, D;

    static int[] visit;

    static boolean isFind = false;

    static int min = 0;

    public static void main(String[] args) {
        try1 T = new try1();

        Scanner sc = new Scanner(System.in);
        F = sc.nextInt(); // 전체층
        S = sc.nextInt(); // 시작
        G = sc.nextInt(); // 목표
        U = sc.nextInt(); // 위
        D = sc.nextInt(); // 아래

        T.solution();
    }

    private void solution() {
        visit = new int[F + 1]; // 0층은 비워둔다
        
        dfs(S, 0);


        if(isFind){
            System.out.println(min);
        } else {
            System.out.println("use the stairs");
        }
    }

    private void dfs(int now, int count){

        // 목표 층에 도착했을 경우
        if(now == G){
            isFind = true;
            min = count;
            return;
        }

        // 모든 층을 전부 방문했다면
        for(int i = 1; i <= F; i++){

        }

        up(now, count);
        down(now, count);
    }

    private void up(int now, int count) {
        int target = now + U;

        // 찾았거나 방문했을 경우
        if(isFind){
            return;
        }

        // 층을 벗어날 경우 예외 처리
        if(target < S || target > F){
            return;
        }

        // 층에 도착할 경우
        visit[target] = count + 1;
        dfs(target, count + 1);

    }

    private void down(int now, int count) {
        int target = now - D;

        // 찾았거나 방문했을 경우
        if(isFind){
            return;
        }

        // 층을 벗어날 경우 예외 처리
        if(target < S || target > F){
            return;
        }

        // 층에 도착할 경우
        visit[target] = count + 1;
        dfs(target, count + 1);
    }


}
