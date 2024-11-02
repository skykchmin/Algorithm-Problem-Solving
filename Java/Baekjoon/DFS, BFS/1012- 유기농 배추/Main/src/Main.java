import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    static int M, N, K;

    static int[][] visit;

    static final int[] dx = {0, 0, 1, -1};
    static final int[] dy = {1, -1, 0, 0};

    public static class Point{
        int x;
        int y;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int t = 0; t < T; t++){
            M = sc.nextInt();
            N = sc.nextInt();
            K = sc.nextInt(); // 배추

            int[][] maps = new int[M][N];
            visit = new int[M][N];

            for(int i = 0; i < K; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();

                maps[x][y] = 1;
            }

            int answer = main.solution(maps);
            System.out.println(answer);
        }
    }

    private int solution(int[][] maps) {
        int count = 0;

        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                // 방문하지 않았고 최초 방문일 경우
                if(visit[i][j] == 0 && maps[i][j] == 1){
                    bfs(maps, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    private void bfs(int[][] maps, int x, int y) {
        Deque<Point> deque = new ArrayDeque<>();
        deque.addLast(new Point(x, y));
        visit[x][y] = 1;

        while (!deque.isEmpty()){
            Point now = deque.pollFirst();

            for(int i = 0; i < 4; i++){
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                // 맵 밖으로
                if(nx < 0 || ny < 0 || nx >= M || ny >= N){
                    continue;
                }

                // 0일 경우
                if(maps[nx][ny] == 0){
                    continue;
                }

                // 방문한적이 없다면 방문 처리
                if(visit[nx][ny] == 0){
                    deque.addLast(new Point(nx, ny));
                    visit[nx][ny] = 1;
                }

            }
        }
    }
}
