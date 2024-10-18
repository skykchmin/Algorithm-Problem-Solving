import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static int n, k;

    static boolean[] visit;

    public class Node {
        int value;
        int count;

        public Node(int value, int count){
            this.value = value;
            this.count = count;
        }
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        visit = new boolean[400000];

        T.solution();
    }

    private void solution() {
        bfs();
    }

    private void bfs() {

        int count = 0; // 찾는 횟수

        // deque 초기화
        ArrayDeque<Node> deque = new ArrayDeque<>();
        deque.addLast(new Node(n, count));
        visit[n + 1] = true;

        while(!deque.isEmpty()){
            Node now = deque.pollFirst();

            // 찾았다면
            if(now.value == k){
                System.out.println(now.count);
                return;
            }

            // 못찾았다면
            // n - 1, n + 1, n * 2

            // Explore neighbors: N - 1, N + 1, N * 2
            // n - 1
            if (now.value - 1 >= 0 && !visit[now.value]) {
                visit[now.value] = true;
                deque.addLast(new Node(now.value - 1, now.count + 1));
            }

            // n + 1
            if (now.value + 1 <= 100000 && !visit[now.value + 2]) {
                visit[now.value + 2] = true;
                deque.addLast(new Node(now.value + 1, now.count + 1));
            }

            // n * 2
            if (now.value * 2 <= 100000 && !visit[now.value * 2 + 1]) {
                visit[now.value * 2 + 1] = true;
                deque.addLast(new Node(now.value * 2, now.count + 1));
            }

        }
    }
}
