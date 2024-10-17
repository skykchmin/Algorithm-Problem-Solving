import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    static int[][] maps;
    static int[][] visit;

    static int n;

    static List<Integer> dange; // 단지 집 수

    static int count; // 단지 갯수
    static int house; // 집 갯수

    public class Point{
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
        sc.nextLine();

        maps = new int[n][n];
        visit = new int[n][n];
        dange = new ArrayList<>(); // 단지를 저장할 배열

        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            String[] strings = s.split("");
            for(int j = 0; j < n; j++){
                maps[i][j] = Integer.parseInt(strings[j]);
            }
        }

        T.solution(n);

        System.out.println(count);

        Collections.sort(dange);

        for(int i : dange){
            System.out.println(i);
        }
    }

    private void solution(int n) {

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                // 방문하지 않았다면
                if(visit[i][j] == 0 && maps[i][j] == 1){
                    house = 0;  // 각 단지를 위한 house count 초기화
                    count++; //
                    dfs(i, j);
                    dange.add(house); // 단지 갯수 추가
                    house = 0; // 단지 갯수 초기화
                }
            }
        }
    }

    public void dfs(int x, int y){

        // 방문 처리
        visit[x][y] = 1;
        house++; // 단지내 집 갯수 증가
        Point now = new Point(x, y);

        // 4방향
        for(int i = 0; i < 4; i++){
            int nx = now.x + dx[i];
            int ny = now.y + dy[i];

            // 예외 처리
            if(nx < 0 || ny < 0 || nx >= n || ny >= n){
                continue;
            }

            // 방문하지 않았고, 1이라면
            if(visit[nx][ny] == 0 && maps[nx][ny] == 1){
                dfs(nx, ny);
            }
        }
    }
}
