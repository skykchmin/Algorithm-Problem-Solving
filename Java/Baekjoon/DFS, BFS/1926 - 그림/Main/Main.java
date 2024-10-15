import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    private static final int[] dx = {0, 0, 1, -1};
    private static final int[] dy = {1, -1, 0, 0};

    private static int[][] maps;

    private static int[][] visit;

    private static int picCount; // 그림의 갯수

    private static int maxPic;

    private static int n, m;


    public static class Point {
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

        sc.nextLine();

        maps = new int[n][m];
        visit = new int[n][m];

        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            String[] strings = s.split(" ");
            for(int j = 0; j < m; j++){
                maps[i][j] = Integer.parseInt(strings[j]);
            }
        }
        
        T.solution(n, m);
    }

    private void solution(int n, int m) {

        int maxCount = 0;

        // bfs
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){ // 방문하지 않았고
                if(visit[i][j] == 0){
                    if(maps[i][j] == 1){
                        picCount++; // 방문하지 않은게 그림의 갯수
                        maxCount = bfs(i, j, 1);
                        maxPic = Math.max(maxCount, maxPic); // 최대 크기 업데이트
                    }
                }

            }
        }

        System.out.println(picCount);
        System.out.println(maxPic);
    }

    public int bfs(int x, int y, int check) {

        int maxCount = 0;

        // 데크 선언
        Deque<Point> deque = new ArrayDeque<>();

        // 초기 값 추가
        deque.addLast(new Point(x, y));
        visit[x][y] = 1;
        maxCount++;

        while(!deque.isEmpty()){

            Point now = deque.pollFirst();

            // 4방향
            for(int i = 0; i < 4; i++){
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                // 네 방향 예외처리
                if(nx < 0 || ny < 0 || nx >= n || ny >= m){
                    continue;
                }

                // 방문하지 않았고 같은 대상이라면
                if(visit[nx][ny] == 0 && maps[nx][ny] == check){
                    deque.addLast(new Point(nx, ny));
                    visit[nx][ny] = 1;
                    maxCount++;
                }
            }
        }

        return maxCount;
    }
}
