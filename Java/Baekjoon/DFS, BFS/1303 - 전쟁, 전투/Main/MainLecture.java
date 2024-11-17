import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class MainLecture {

    private static final int[] dx = {0, 0, 1, -1};
    private static final int[] dy = {1, -1, 0, 0};

    static int[][] visited;

    static class Node{
        int x;
        int y;

        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받기
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        char[][] maps = new char[n][m];

        // 맵 데이터 입력 받기
        for (int i = 0 ; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                maps[i][j] = s.charAt(j);
            }
        }

        T.solution(n, m, maps);
    }

    public void solution(int n, int m, char[][] maps){

        visited = new int[n][m];

        int wCount = 0;
        int bCount = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(visited[i][j] == 0){
                    int count = bfs(i, j, n, m, maps);
                    if(maps[i][j] == 'W'){
                        wCount += Math.pow(count, 2);
                    } else {
                        bCount += Math.pow(count, 2);
                    }
                }
            }
        }

        System.out.println(wCount + " " + bCount);
    }

    private int bfs(int x, int y, int n, int m, char[][] maps) {

        Deque<Node> deque = new ArrayDeque<>();
        visited = new int[n][m];

        //
        deque.addLast(new Node(0, 0));
        visited[x][y] = 1;
        int count = 1;

        while (!deque.isEmpty()){

            Node now = deque.pollFirst();

            // 4 방향 이동
            for(int i = 0; i < 4; i++){
                int nr = now.x + dx[i];
                int nc = now.y + dy[i];

                // 맵 밖으로 나가면 안되는 예외처리
                if(nr < 0 || nc < 0 || nr >= n || nc >= m){
                    continue;
                }

                // 이동한 위치가 처음 방문할 경우
                if(visited[nr][nc] == 0 && maps[nr][nc] == maps[x][y]){
                    deque.addLast(new Node(nr, nc));
                    visited[nr][nc] = 1;
                    count++;
                }
            }
        }

        return count;
    }
}
