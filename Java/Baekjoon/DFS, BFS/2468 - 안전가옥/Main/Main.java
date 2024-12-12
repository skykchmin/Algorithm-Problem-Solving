import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    static int[][] maps;

    static boolean[][] visit;

    static int n;

    static int max = Integer.MIN_VALUE;

    static int countMax = Integer.MIN_VALUE;

    static final int[] dx = {0, 0, 1, -1};
    static final int[] dy = {1, -1, 0, 0};

    public class Point{
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

        sc.nextLine();

        maps = new int[n][n];
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            String[] strings = s.split(" ");
            for(int j = 0; j < n; j++){
                int parseInt = Integer.parseInt(strings[j]);

                max = Math.max(parseInt, max);
                maps[i][j] = parseInt;
            }
        }

        for(int i = 0; i <= max; i++){
            T.solution(i);
        }

        System.out.println(countMax);
    }

    private void solution(int limit) {
        int count = 0;

        visit = new boolean[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(!visit[i][j] && maps[i][j] > limit){
                    count++;
                    bfs(i, j, limit);
                }
            }
        }

        countMax = Math.max(count, countMax);
    }

    private void bfs(int x, int y, int limit) {
        Deque<Point> deque = new ArrayDeque<>();
        deque.addLast(new Point(x, y));
        visit[x][y] = true;

        while(!deque.isEmpty()){
            Point now = deque.pollFirst();

            for(int i = 0; i < 4; i++){
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if(nx < 0 || ny < 0 || nx >= n || ny >= n){
                    continue;
                }

                if(visit[nx][ny] == true){
                    continue;
                }

                if(maps[nx][ny] <= limit){
                    continue;
                }

                deque.addLast(new Point(nx, ny));
                visit[nx][ny] = true;
            }
        }
    }
}
