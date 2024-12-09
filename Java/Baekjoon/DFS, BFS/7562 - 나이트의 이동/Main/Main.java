import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;

public class Main {

    static final int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static final int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

    static public class Point{
        int x;
        int y;

        int count;

        public Point(int x, int y, int count){
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }


    public static void main(String[] args) throws IOException {
        Main T = new Main();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(reader.readLine().trim());

        for (int i = 0; i < t; i++) {
            int l = Integer.parseInt(reader.readLine().trim());

            String[] currentPos = reader.readLine().trim().split(" ");
            int currentX = Integer.parseInt(currentPos[0]);
            int currentY = Integer.parseInt(currentPos[1]);

            String[] targetPos = reader.readLine().trim().split(" ");
            int targetX = Integer.parseInt(targetPos[0]);
            int targetY = Integer.parseInt(targetPos[1]);

            int answer = T.solution(l, currentX, currentY, targetX, targetY);
            System.out.println(answer);
        }
    }

    public int solution(int l, int currentX, int currentY, int targetX, int targetY) {
        if(currentX == targetX && currentY == targetY){
            return 0;
        }

        int[][] visit = new int[l][l];
        ArrayDeque<Point> deque = new ArrayDeque<>();
        deque.addLast(new Point(currentX, currentY, 0));
        visit[currentX][currentY] = 1;

        while(!deque.isEmpty()){
            Point now = deque.pollFirst();

            for(int i = 0; i < 8; i++){
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if(nx < 0 || ny < 0 || nx >= l || ny >= l){
                    continue;
                }

                if(visit[nx][ny] == 1){
                    continue;
                }

                // 타겟에 도착한다면
                if (nx == targetX && ny == targetY) {
                    return now.count + 1; // 목표 위치에 도달하면 이동 횟수 반환
                }

                deque.addLast(new Point(nx, ny, now.count + 1));
                visit[nx][ny] = 1; // 방문처리
            }
        }

        return -1;
    }
}
