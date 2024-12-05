import java.util.*;

public class Main {
    
    static List<Point> pointList = new ArrayList<>();

    static List<Integer> sizeList = new ArrayList<>();
    
    static int[][] maps;

    static boolean[][] visit;

    static final int[] dx = {0, 0, 1, -1};
    static final int[] dy = {1, -1, 0, 0};
    
    static public class Point{
        int x;
        int y;
        
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    static int m;
    static int n;
    static int k;
    
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        k = sc.nextInt();

        sc.nextLine();

        for(int i = 0; i < k; i++){
            String s = sc.nextLine();
            String[] strings = s.split(" ");
            pointList.add(new Point(Integer.parseInt(strings[1]), Integer.parseInt(strings[0])));
            pointList.add(new Point(Integer.parseInt(strings[3]), Integer.parseInt(strings[2])));
        }

        maps = new int[m][n];
        visit = new boolean[m][n];
        
        T.solution();
        Collections.sort(sizeList);
        System.out.println(sizeList.size());
        for (int i = 0; i < sizeList.size(); i++){
            System.out.print(sizeList.get(i) + " ");
        }
    }

    private void solution() {
        // 영역 칠하기
        for (int i = 0; i < k; i++) { // k개의 직사각형 처리
            Point low = pointList.get(2 * i);       // 시작 점 (y1, x1)
            Point high = pointList.get(2 * i + 1); // 끝 점 (y2, x2)

            // 주어진 직사각형 영역 칠하기
            for (int y = low.x; y < high.x; y++) {       // 행 (y축) 순회
                for (int x = low.y; x < high.y; x++) {   // 열 (x축) 순회
                    maps[y][x] = 1; // 직사각형 영역을 1로 표시
                }
            }
        }

        //
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(maps[i][j] == 0 && !visit[i][j]){
                    bfs(i, j);
                }
            }
        }
    }

    private void bfs(int x, int y) {

        Deque<Point> deque = new ArrayDeque<>();
        deque.addLast(new Point(x, y));
        visit[x][y] = true;
        int count = 1;

        while(!deque.isEmpty()){
            Point now = deque.pollFirst();

            for(int i = 0; i < 4; i++){
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if(nx < 0 || ny < 0 || nx >= m || ny >= n){
                    continue;
                }

                // 직사각형 영역
                if(maps[nx][ny] == 1){
                    continue;
                }

                // 방문했다면 X
                if(visit[nx][ny] == true){
                    continue;
                }

                deque.addLast(new Point(nx, ny));
                visit[nx][ny] = true;
                count++; // 직사각형 넓이 + 1
            }
        }

        sizeList.add(count);
    }
}
