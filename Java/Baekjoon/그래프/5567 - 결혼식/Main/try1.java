import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class try1 {
    
    static int[][] maps;

    static int n;
    static int m;

    static Set<Integer> set = new HashSet<>();

    static public class Friend{
        int x;
        int count;

        public Friend(int x, int count){
            this.x = x;
            this.count = count;
        }
    }
    
    public static void main(String[] args) {
        try1 T = new try1();

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        sc.nextLine();

        maps = new int[n + 1][n + 1];

        for(int i = 0; i < m; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            maps[x][y] = 1;
            maps[y][x] = 1;
        }

        T.solution();
        System.out.println(set.size()); // 상근이 자신 제외
    }

    private void solution() {
        int start = 1;

        for(int i = 1; i <= n; i++){
            if(maps[start][i] == 1){ // 조건 추가하기
                bfs(i);
            }
        }
    }

    private void bfs(int start) {

        int count = 1;

        boolean[] visit = new boolean[n + 1];

        ArrayDeque<Friend> deque = new ArrayDeque<>();
        deque.addLast(new Friend(start, count));
        visit[start] = true;
        set.add(start);

        while (!deque.isEmpty()){
            Friend now = deque.pollFirst();

            if (now.count > 2) { // 깊이 2까지만 탐색
                break;
            }

            for(int i = 1; i <= n; i++){
                if(maps[now.x][i] == 1 && !visit[i]){
                    deque.addLast(new Friend(i, now.count + 1));
                    visit[i] = true;
                    set.add(i);
                }
            }
        }
    }
}
