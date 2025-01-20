import java.util.Scanner;

public class MainLecture {
    static int[][] maps;
    static int white = 0;
    static int blue = 0;

    static class Point {
        int y, x;

        public Point(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }

    public static void main(String[] args) {
        MainLecture T = new MainLecture();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        maps = new int[n][n];

        for (int i = 0; i < n; i++) { // 입력 받기
            for (int j = 0; j < n; j++) {
                maps[i][j] = sc.nextInt();
            }
        }
        T.solution(maps, n);

        // 결과 출력
        System.out.println(white);
        System.out.println(blue);
    }

    private void solution(int[][] maps, int n) {
        dfs(new Point(0, 0), new Point(n, n), n); // 0-based 시작
    }

    public void dfs(Point start, Point end, int n) {
        if (n == 1) { // 더 이상 쪼갤 수 없을 경우
            if (maps[start.y][start.x] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        // 수가 같은지 확인
        int basis = maps[start.y][start.x];
        boolean isSame = true;

        for (int i = start.y; i < end.y; i++) { // [start.y, end.y)
            for (int j = start.x; j < end.x; j++) { // [start.x, end.x)
                if (basis != maps[i][j]) {
                    isSame = false;
                    break;
                }
            }
            if (!isSame) break;
        }

        if (isSame) { // 모든 값이 같은 경우
            if (basis == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        // 더 쪼갤 수 있을 경우(4등분)
        int length = n / 2;

        // 1사분면
        dfs(new Point(start.y, start.x), new Point(start.y + length, start.x + length), length);
        // 2사분면
        dfs(new Point(start.y, start.x + length), new Point(start.y + length, start.x + 2 * length), length);
        // 3사분면
        dfs(new Point(start.y + length, start.x), new Point(start.y + 2 * length, start.x + length), length);
        // 4사분면
        dfs(new Point(start.y + length, start.x + length), new Point(start.y + 2 * length, start.x + 2 * length), length);
    }
}
