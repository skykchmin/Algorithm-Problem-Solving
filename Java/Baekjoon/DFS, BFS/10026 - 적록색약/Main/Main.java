import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    static int n;

    static class Point{
        int x;
        int y;

        char color;

        public Point(int x, int y, char color){
            this.x = x;
            this.y = y;
            this.color = color;
        }
    }


    static boolean[][] redVisit;
    static boolean[][] notRedVisit;

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        
        char[][] maps = new char[n][n];
        for(int i = 0; i < n; i++){
            String strings = sc.nextLine();
            for(int j = 0; j < n; j++){
                maps[i][j] = strings.charAt(j);
            }
        }
        
        T.solution(n, maps);
    }

    public void solution(int n, char[][] maps) {
        int red = 0;
        int notRed = 0;

        redVisit = new boolean[n][n];
        notRedVisit = new boolean[n][n];

        // 색약
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(redVisit[i][j] != true){
                    redBfs(maps, new Point(i, j, maps[i][j]));
                    red++;
                }
            }
        }

        // X
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(notRedVisit[i][j] != true){
                    notRedBfs(maps, new Point(i, j, maps[i][j]));
                    notRed++;
                }
            }
        }

        System.out.print(notRed + " " + red);
    }

    public void redBfs(char[][] maps, Point current) {
        char basis = current.color;

        Deque<Point> deque = new ArrayDeque<>();
        deque.addLast(current);
        redVisit[current.x][current.y] = true;

        while(!deque.isEmpty()){
            Point now = deque.pollFirst();

            for(int i = 0; i < 4; i++){
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if(nx < 0 || ny < 0 || nx >= n || ny >= n){
                    continue;
                }

                if(redVisit[nx][ny]){
                    continue;
                }

                if(basis == 'R' || basis == 'G'){
                    if(maps[nx][ny] == 'R' || maps[nx][ny] == 'G'){
                        deque.addLast(new Point(nx, ny, maps[nx][ny]));
                        redVisit[nx][ny] = true;
                    }
                } else if(basis == 'B'){
                    if(maps[nx][ny] == 'B'){
                        deque.addLast(new Point(nx, ny, maps[nx][ny]));
                        redVisit[nx][ny] = true;
                    }
                }
            }
        }
    }

    public void notRedBfs(char[][] maps, Point current) {
        char basis = current.color;

        Deque<Point> deque = new ArrayDeque<>();
        deque.addLast(current);
        notRedVisit[current.x][current.y] = true;

        while(!deque.isEmpty()){
            Point now = deque.pollFirst();

            for(int i = 0; i < 4; i++){
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if(nx < 0 || ny < 0 || nx >= n || ny >= n){
                    continue;
                }

                if(notRedVisit[nx][ny]){
                    continue;
                }

                if(basis == maps[nx][ny]){
                    deque.addLast(new Point(nx, ny, maps[nx][ny]));
                    notRedVisit[nx][ny] = true;
                }
            }
        }
    }
}
