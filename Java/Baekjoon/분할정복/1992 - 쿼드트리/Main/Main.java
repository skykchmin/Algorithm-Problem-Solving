import java.util.Scanner;

public class Main {

    static int[][] maps;

    public class Point{
        int y;
        int x;

        public Point(int y, int x){
            this.y = y;
            this.x = x;
        }
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        maps = new int[n][n];

        for(int i = 0; i < n; i++){
            String[] strings = sc.nextLine().split("");
            for(int j = 0; j < n; j++){
                maps[i][j] = Integer.parseInt(strings[j]);
            }
        }

        T.solution(n);
    }

    private void solution(int n) {
        dfs(new Point(0, 0 ), n);
    }

    private void dfs(Point start, int length) {
        if(length == 1){
            System.out.print(maps[start.y][start.x]);
            return;
        }



        // 기준점 잡기
        int sy = start.y;
        int sx = start.x;
        int basis = maps[sy][sx];
        boolean isSame = true;

        // 4등분하기
        for (int i = sy; i < sy + length; i++) {
            for (int j = sx; j < sx + length; j++) {
                if (basis != maps[i][j]) {
                    isSame = false;
                    break;
                }
            }
        }

        if(!isSame){
            System.out.print("(");
            int half = length / 2;

            // 4등분
            dfs(new Point(sy, sx), half); // 왼쪽 위
            dfs(new Point(sy, sx + half), half); // 오른쪽 위
            dfs(new Point(sy + half, sx), half); // 왼쪽 아래
            dfs(new Point(sy + half, sx + half), half); // 오른쪽 아래
            System.out.print(")");
        } else {
            System.out.print(basis);
        }
    }
}
