import java.util.Scanner;

public class Main {

    static int[][] maps;

    static int[][] dp;

    static int n;

    static final int[] dx = {0, 0, 1, -1};

    static final int[] dy = {1, -1, 0, 0};

    static int max = Integer.MIN_VALUE;


    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        maps = new int[n][n];
        dp = new int[n][n];

        sc.nextLine();

        for(int i = 0; i < n; i++){
            String[] strings = sc.nextLine().split(" ");
            for(int j = 0; j < n; j++){
                maps[i][j] = Integer.parseInt(strings[j]);
            }
        }

        T.solution();
        System.out.println(max);
    }

    public void solution() {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                dp[i][j] = dfs(i, j);
            }
        }

        // dp에서 최댓값 뽑기
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                max = Math.max(max, dp[i][j]);
            }
        }
    }

    public int dfs(int x, int y) {
        if(dp[x][y] != 0){
            return dp[x][y];
        }

        int point = 1;

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || ny < 0 || nx >= n || ny >= n){
                continue;
            }

            // 현재 값보다 클 경우에만 이동
            if(maps[x][y] < maps[nx][ny]){
                // 4방향으로 갔을 때 최대값을 저장 dp에
                point = Math.max(point, dfs(nx, ny) + 1);
            }
        }

        dp[x][y] = point; // dp에 저장

        return point;
    }
}
