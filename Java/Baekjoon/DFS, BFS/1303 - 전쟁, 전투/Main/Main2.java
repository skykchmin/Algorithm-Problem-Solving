import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main2 {

    static int n, m;

    public static final int[] dx = {0, 0, 1, -1};
    public static final int[] dy = {1, -1, 0, 0};

    public static int[][] visit; // 방문 여부

    public static char[][] maps; //

    public static class Node{
        int x;
        int y;

        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        Main2 T = new Main2();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받기
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        maps = new char[n][m];

        // 맵 데이터 입력 받기
        for (int i = 0 ; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                maps[i][j] = s.charAt(j);
            }
        }

        T.solution(n, m, maps);
    }

    private void solution(int n, int m, char[][] maps) {

        visit = new int[n][m]; // 방문 여부 배열

        int wSum = 0;
        int bSum = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(visit[i][j] == 0){ // 방문하지 않은 노드에서만
                    if(maps[i][j] == 'W'){
                        int count = bfs(i, j, 'W');
                        wSum += Math.pow(count, 2);
                    } else {
                        int count = bfs(i, j, 'B');
                        bSum += Math.pow(count, 2);
                    }
                }
            }
        }

        System.out.println(wSum + " " + bSum);
    }

    private int bfs(int x, int y, char c) {
        Deque<Node> deque = new ArrayDeque<>();

        // 첫 노드 방문처리
        deque.addLast(new Node(x, y));
        visit[x][y] = 1;
        int count = 1;

        while (!deque.isEmpty()){

            // 인접 데크
            Node now = deque.pollFirst();

            // 4방향
            for(int i = 0; i < 4; i++){
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                // 맵 밖으로 나가지 않도록 예외 처리
                if(nx < 0 || ny < 0 || nx >= n || ny >= m){
                    continue;
                }

                // 방문했다면
                if(visit[nx][ny] == 1){
                    continue;
                }

                if(maps[nx][ny] == c){
                    deque.addLast(new Node(nx, ny));
                    visit[nx][ny] = 1;
                    count++; // 인접이 있다면 count 추가
                }
            }
        }

        return count;
    }
}
