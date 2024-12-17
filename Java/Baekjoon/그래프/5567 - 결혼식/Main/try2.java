import java.util.ArrayDeque;
import java.util.Scanner;

public class try2 {
    static int[][] maps;

    static int n;
    static int m;

    static boolean[] visit;

    static public class Friend{
        int x;
        int count;

        public Friend(int x, int count){
            this.x = x;
            this.count = count;
        }
    }

    public static void main(String[] args) {
        try2 T = new try2();

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        sc.nextLine();

        maps = new int[n + 1][n + 1];
        visit = new boolean[n + 1];
        visit[1] = true; // 자기 자신

        for(int i = 0; i < m; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            maps[x][y] = 1;
            maps[y][x] = 1;
        }

        T.solution();

        int answer = 0;
        for(int i = 2; i <= n; i++){
            if(visit[i]){
                answer++;
            }
        }

        System.out.println(answer);
    }

    private void solution() {
        int start = 1;

        bfs(start);
    }

    private void bfs(int start) {
        ArrayDeque<Friend> deque = new ArrayDeque<>();
        deque.addLast(new Friend(start, 1));

        while (!deque.isEmpty()) {
            Friend friend = deque.pollFirst();

            if (friend.count > 2) {
                continue;
            }

            for (int i = 1; i <= n; i++) {
                // 연결된 노드이고, 방문하지 않았으면
                if (maps[friend.x][i] == 1 && !visit[i]) {
                    visit[i] = true; // 방문 표시
                    deque.addLast(new Friend(i, friend.count + 1)); // 큐에 추가
                }
            }
        }
    }
}
