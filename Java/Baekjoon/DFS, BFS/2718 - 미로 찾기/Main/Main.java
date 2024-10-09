import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static final int[] rx = {0, 0, 1, -1};
    public static final int[] ry = {1, -1, 0, 0};

    static int[][] dist;

    public class Node{
        int x;
        int y;

        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        sc.nextLine();

        int[][] maps = new int[n][m];
        dist = new int[n][m];

        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            String[] strings = s.split("");
            for(int j = 0; j < m; j++){
                maps[i][j] = Integer.parseInt(strings[j]);
            }
        }

        int answer = T.solution(n, m, maps);
        System.out.println(answer);
    }

    private int solution(int n, int m, int[][] maps) {

        Deque<Node> deque = new ArrayDeque<>();
        deque.addFirst(new Node(0, 0));

        dist[0][0] = 1;

        while (!deque.isEmpty()){

            Node now = deque.pollFirst();

            for(int i = 0; i < 4; i++){
                int nr = now.x + rx[i];
                int nc = now.y + ry[i];

                // 맵 밖으로 나가지 않게 처리
                if(nr < 0 || nc < 0 || nr >= n || nc >= m){
                    continue;
                }

                // 벽으로 가지않게 처리(벽은 0)
                if(maps[nr][nc] == 0){
                    continue;
                }

                // 이동한 위치가 처음인 경우 최단 거리 추가
                if(dist[nr][nc] == 0){
                    deque.addLast(new Node(nr, nc));
                    dist[nr][nc] = dist[now.x][now.y] + 1;
                }
            }
        }

        return dist[n-1][m-1] == 0 ? -1 : dist[n-1][m-1];
    }
}
