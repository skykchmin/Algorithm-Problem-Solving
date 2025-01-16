import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    static int[][][] boxes;
    static boolean[][][] visit;

    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static int[] dz = {1, -1};

    static int M, N, H;

    static class Point{

        int h;
        int x;
        int y;

        public Point(int h, int x, int y){
            this.h = h;
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        H = sc.nextInt();

        boxes = new int[H][N][M];
        visit = new boolean[H][N][M];

        // Read the statuses for all the boxes
        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                for (int m = 0; m < M; m++) {
                    boxes[h][n][m] = sc.nextInt();
                }
            }
        }

        sc.close();

        int answer = T.solution();
        System.out.println(answer);
    }

    public int solution() {

        int count = 0;

        // 탐색
        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                for (int m = 0; m < M; m++) {
                    if(!visit[h][n][m] && boxes[h][n][m] == 1){ // 방문하지 않았고 익은 토마토
                        bfs(h, n, m);
                        count++;
                    }
                }
            }
        }

        // 안 익은게 있는지 확인
        for (int h = 0; h < H; h++) {
            for (int n = 0; n < N; n++) {
                for (int m = 0; m < M; m++) {
                    if(boxes[h][n][m] == 0){ // 아직 익지 않은 토맠토
                        count = -1;
                    }
                }
            }
        }

        return count;
    }

    public void bfs(int h, int n, int m) {

        Deque<Point> deque = new ArrayDeque<>();
        deque.addLast(new Point(h, n, m));
        visit[h][n][m] = true;

        while (!deque.isEmpty()){
            Point now = deque.poll();
            for(int i = 0; i < 4; i++){
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                // 맵 밖을 벗어났는지 확인
                if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                    continue;
                }

                // 방문했을 경우
                if (!visit[now.h][nx][ny] && boxes[now.h][nx][ny] == 0) {
                    deque.addLast(new Point(now.h, nx, ny));
                    visit[now.h][nx][ny] = true;
                    boxes[now.h][nx][ny] = 1;
                }
            }

            for (int i = 0; i < 2; i++) {
                int nh = now.h + dz[i];

                if (nh < 0 || nh >= H) {
                    continue;
                }

                if (!visit[nh][now.x][now.y] && boxes[nh][now.x][now.y] == 0) {
                    deque.addLast(new Point(nh, now.x, now.y));
                    visit[nh][now.x][now.y] = true;
                    boxes[nh][now.x][now.y] = 1;
                }
            }
        }

    }
}
