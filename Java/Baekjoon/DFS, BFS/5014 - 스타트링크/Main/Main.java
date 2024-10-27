import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    static int F, S, G, U, D;
    static int[] visit;

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        F = sc.nextInt(); // 전체층
        S = sc.nextInt(); // 시작
        G = sc.nextInt(); // 목표
        U = sc.nextInt(); // 위
        D = sc.nextInt(); // 아래

        T.solution();
    }

    private void solution() {
        visit = new int[F + 1];

        for (int i = 0; i <= F; i++) {
            visit[i] = -1; // 방문하지 않은 층을 -1로 초기화
        }

        bfs();
    }

    private void bfs() {
        Deque<Integer> deque = new ArrayDeque<>();

        // 방문 처리
        deque.addLast(S);
        visit[S] = 0;

        while(!deque.isEmpty()){
            Integer now = deque.pollFirst();

            // 방문 했을 경우
            if(now == G){
                System.out.println(visit[now]);
                return;
            }

            // 위로 올라가기
            int up = now + U;
            if(up <= F && visit[up] == -1){
                deque.addLast(up);
                visit[up] = visit[now] + 1;
            }

            // 아래로 올라가기
            int down = now - D;
            if(down >= 1 && visit[down] == -1){
                deque.addLast(down);
                visit[down] = visit[now] + 1;
            }
        }

        // 얼리 리턴이 안되었을 경우
        System.out.println("use the stairs");
    }
}
