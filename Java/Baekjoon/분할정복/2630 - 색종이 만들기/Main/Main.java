import java.util.Scanner;

public class Main {

    static int[][] maps;

    static int white = 0;

    static int blue = 0;


    static class Point{
        int y, x;

        public Point(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        maps = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maps[i][j] = sc.nextInt();
            }
        }

        T.solution(maps, n);
        System.out.println(white);
        System.out.println(blue);
    }

    private void solution(int[][] maps, int n) {
        dfs(new Point(0, 0), new Point(n, n), n);
    }

    public void dfs(Point start, Point end, int n) {
        if(n == 1){ // 더 이상 쪼갤 수 없을 경우
            if(maps[start.x][start.y] == 0){
                white++;
            } else {
                blue++;
            }

            return;
        }

        // 수가 같은지 확인
        int basis = maps[start.x][start.y];
        boolean isSame = true;

        for(int i = start.y; i < end.y; i++){
            for(int j = start.x; j < end.x; j++){
                if(basis != maps[i][j]){
                    isSame = false;
                    break;
                }
            }
        }

        if(isSame){
            if(basis == 0){
                white++;
            } else {
                blue++;
            }

            return;
        }


        // 더 쪼갤 수 있을 경우(4등분)
        int length = n / 2;

        // 1st quadrant
        dfs(new Point(start.y, start.x), new Point(start.y + length, start.x + length), length);
        // 2nd quadrant
        dfs(new Point(start.y, start.x + length), new Point(start.y + length, end.x), length);
        // 3rd quadrant
        dfs(new Point(start.y + length, start.x), new Point(end.y, start.x + length), length);
        // 4th quadrant
        dfs(new Point(start.y + length, start.x + length), new Point(end.y, end.x), length);
    }
}
