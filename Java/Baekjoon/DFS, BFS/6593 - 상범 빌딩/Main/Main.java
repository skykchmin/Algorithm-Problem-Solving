import java.util.*;

public class Main {
    static int[] dl = {0, 0, 0, 0, 1, -1}; // 위, 아래
    static int[] dr = {0, 0, 1, -1, 0, 0}; // 동, 서
    static int[] dc = {1, -1, 0, 0, 0, 0}; // 남, 북

    static class Point {
        int l, r, c, time;

        public Point(int l, int r, int c, int time) {
            this.l = l;
            this.r = r;
            this.c = c;
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            int C = sc.nextInt();
            if (L == 0 && R == 0 && C == 0) break; // 종료 조건
            sc.nextLine(); // 개행 문자 제거

            char[][][] map = new char[L][R][C];
            Point start = null, exit = null;

            for (int l = 0; l < L; l++) {
                if (l > 0) sc.nextLine(); // 층 사이 빈 줄 스킵
                for (int r = 0; r < R; r++) {
                    String line = sc.nextLine();
                    for (int c = 0; c < C; c++) {
                        map[l][r][c] = line.charAt(c);
                        if (map[l][r][c] == 'S') {
                            start = new Point(l, r, c, 0);
                        } else if (map[l][r][c] == 'E') {
                            exit = new Point(l, r, c, 0);
                        }
                    }
                }
            }

            int steps = bfs(map, start, exit, L, R, C);
            if (steps != -1) {
                System.out.println("Escaped in " + steps + " minute(s).");
            } else {
                System.out.println("Trapped!");
            }
        }

        sc.close();
    }

    private static int bfs(char[][][] map, Point start, Point exit, int L, int R, int C) {
        boolean[][][] visit = new boolean[L][R][C];
        Queue<Point> queue = new LinkedList<>();
        queue.add(start);
        visit[start.l][start.r][start.c] = true;

        while (!queue.isEmpty()) {
            Point current = queue.poll();

            if (current.l == exit.l && current.r == exit.r && current.c == exit.c) {
                return current.time; // 출구 도착
            }

            for (int i = 0; i < 6; i++) {
                int nl = current.l + dl[i];
                int nr = current.r + dr[i];
                int nc = current.c + dc[i];

                // 범위 초과 확인
                if (nl < 0 || nr < 0 || nc < 0 || nl >= L || nr >= R || nc >= C) {
                    continue;
                }

                // 방문 여부 및 이동 가능 여부 확인
                if (!visit[nl][nr][nc] && (map[nl][nr][nc] == '.' || map[nl][nr][nc] == 'E')) {
                    visit[nl][nr][nc] = true;
                    queue.add(new Point(nl, nr, nc, current.time + 1));
                }
            }
        }

        return -1; // 탈출 불가능
    }
}
