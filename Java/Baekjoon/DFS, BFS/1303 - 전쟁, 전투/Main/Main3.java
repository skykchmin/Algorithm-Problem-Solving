import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main3 {
    static int n, m;
    static char[][] maps;
    static int[][] visit;
    static final int[] dx = {0, 0, 1, -1};
    static final int[] dy = {1, -1, 0, 0};
    static int wCount;
    static int bCount;

    public static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        Main3 T = new Main3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);

        maps = new char[m][n];
        visit = new int[m][n];

        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                maps[i][j] = s.charAt(j);
            }
        }

        T.solution();
        System.out.println(wCount + " " + bCount);
    }

    private void solution() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visit[i][j] == 0) {
                    if (maps[i][j] == 'W') {
                        wCount += bfs(j, i, 'W');
                    } else if (maps[i][j] == 'B') {
                        bCount += bfs(j, i, 'B');
                    }
                }
            }
        }
    }

    private int bfs(int x, int y, char color) {
        int count = 1;
        Deque<Point> deque = new ArrayDeque<>();
        deque.addLast(new Point(x, y));
        visit[y][x] = 1;

        while (!deque.isEmpty()) {
            Point now = deque.pollFirst();

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    continue;
                }

                if (visit[ny][nx] == 1 || maps[ny][nx] != color) {
                    continue;
                }

                deque.addLast(new Point(nx, ny));
                visit[ny][nx] = 1;
                count++;
            }
        }
        return (int) Math.pow(count, 2);
    }
}