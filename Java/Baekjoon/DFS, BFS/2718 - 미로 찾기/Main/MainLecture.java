import java.util.ArrayDeque;
import java.util.Scanner;

public class MainLecture {

    private static final int[] x = {0, 0, 1, -1};
    private static final int[] y = {1, -1, 0, 0};

    static class Node{
        int x;
        int y;

        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        MainLecture T = new MainLecture();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        sc.nextLine();
        
        int[][] arr = new int[n][m];
        
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            String[] strings = s.split("");
            for(int j = 0; j < m; j++){
                arr[i][j] = Integer.parseInt(strings[j]);
            }
        }
        
        T.solution(arr);
    }

    private void solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        // 최단 거리를 저장할 배열 생성
        int[][] dist = new int[n][m];

        // bfs 탐색을 위한 큐 생성
        ArrayDeque<Node> deque = new ArrayDeque<>();

        // 첫 노드를 넣어준다
        deque.addFirst(new Node(0, 0));

        while(!deque.isEmpty()){

            Node now = deque.pollFirst();

            for(int i = 0; i < 4; i++){
                int nr = now.x + x[i];
                int nc = now.y + y[i];

                // 밖으로 나가지 않게 처리
                if(nr < 0 || nc < 0 || nr >= n || nc >= m){
                    continue;
                }

                // 벽으로 가는 경우 예외 처리
                if(maps[nr][nc] == 0){
                    continue;
                }

                // 이동한 칸이 방문하지 않을 경우 큐에 추가하고 최단거리 추가
                if(dist[nr][nc] == 0){
                    deque.addLast(new Node(nr, nc));
                    dist[nr][nc] = dist[now.x][now.y] + 1;
                }
            }
        }
    }
}
