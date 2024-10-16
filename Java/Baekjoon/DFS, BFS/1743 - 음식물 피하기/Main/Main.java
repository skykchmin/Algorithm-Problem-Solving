import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    static final int[] dx = {0, 0, 1, -1};
    static final int[] dy = {1, -1, 0, 0};

    static int[][] maps;
    static int[][] visit;

    static int n, m;

    static int max;

    public static class Point{
        int x;
        int y;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        int k = sc.nextInt();

        sc.nextLine();

        maps = new int[n][m];
        visit = new int[n][m];

        for(int i = 0; i < k; i++){
            String s = sc.nextLine();
            String[] strings = s.split(" ");
            for(int j = 0; j < 2; j++){
                int x = Integer.parseInt(strings[0]);
                int y = Integer.parseInt(strings[1]);

                maps[x -1][y - 1] = 1;
            }
        }

        T.solution();
        System.out.println(max);
    }

    private void solution() {

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(visit[i][j] == 0 && maps[i][j] == 1){
                    int count = bfs(i, j);
                    max = Math.max(max, count);
                }
            }
        }
    }

    private int bfs(int x, int y) {
        int count = 1;

        // 데크 선언 및 초기화
        Deque<Point> deque = new ArrayDeque<>();
        deque.addLast(new Point(x, y));
        visit[x][y] = 1; // 방문

        while (!deque.isEmpty()){
            Point now = deque.pollFirst();

            // 4방향
            for(int i = 0; i < 4; i++){
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                // 예외처리
                if(nx < 0 || ny < 0 || nx >= n || ny >= m){
                    continue;
                }

                if(visit[nx][ny] == 0 && maps[nx][ny] == 1){
                    deque.addLast(new Point(nx, ny));
                    visit[nx][ny] = 1;
                    count++;
                }
            }
        }

        return count;
    }
}
