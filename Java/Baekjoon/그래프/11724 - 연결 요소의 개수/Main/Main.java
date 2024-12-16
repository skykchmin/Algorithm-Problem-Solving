import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    static int[][] graph;

    static boolean[] visit;

    static int n;
    static int m;

    public static void print(int x, int y){
        graph[x][y] = 1;
        graph[y][x] = 1;
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        sc.nextLine();

        graph = new int[n + 1][n + 1];
        visit = new boolean[n + 1];

        int count = 0;

        for(int i = 0; i < m; i++){
            String s = sc.nextLine();
            String[] strings = s.split(" ");
            int x = Integer.parseInt(strings[0]);
            int y = Integer.parseInt(strings[1]);

            print(x, y);
        }

        for(int i = 1; i <= n; i++){
            if(!visit[i]){
                T.bfs(i);
                count++;
            }
        }

        System.out.println(count);
    }

    private void bfs(int start) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addLast(start);
        visit[start] = true;

        while(!deque.isEmpty()){
            Integer col = deque.pollFirst();

            for(int i = 1; i <= n; i++){
                if(graph[col][i] == 1 && !visit[i]){
                    deque.addLast(i);
                    visit[i] = true;
                }
            }
        }
    }
}
