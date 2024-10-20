import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    static int N;
    static int X;

    static int[] visit;

    static int min = Integer.MAX_VALUE;

    static int fitCount = 0;

    public class Node{
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

        N = sc.nextInt();
        X = sc.nextInt();

        visit = new int[100001];

        // 초기값이 같으면 바로 결과 출력
        if (N == X) {
            System.out.println(0);
            System.out.println(1);
            return;
        }

        T.solution();

        System.out.println(min);
        System.out.println(fitCount);
    }

    private void solution() {
        // bfs
        bfs();
    }

    private void bfs() {

        // deque 초기화
        Deque<Node> deque = new ArrayDeque<>();
        deque.addLast(new Node(N, 0));
        visit[N] = 1;

        while(!deque.isEmpty()){
            Node now = deque.pollFirst();

            if(now.value == X){
                // 현재 count 할당
                if(now.count == min){
                    fitCount++;
                } else if(now.count < min){
                    min = now.count;
                    fitCount = 1;
                }
            }

            // N - 1
            if(now.value - 1 >= 0 && (visit[now.value - 1] == 0 || visit[now.value - 1] == now.count + 1)){
                deque.addLast(new Node(now.value - 1, now.count + 1));
                if (visit[now.value - 1] == 0) {
                    visit[now.value - 1] = now.count + 1;
                }
            }

            // N + 1
            if(now.value + 1 <= 100000 && (visit[now.value + 1] == 0 || visit[now.value + 1] == now.count + 1)){
                deque.addLast(new Node(now.value + 1, now.count + 1));
                if (visit[now.value + 1] == 0) {
                    visit[now.value + 1] = now.count + 1;
                }
            }

            // 2X
            if(now.value * 2 <= 100000 && (visit[now.value * 2] == 0 || visit[now.value * 2] == now.count + 1)){
                deque.addLast(new Node(now.value * 2, now.count + 1));
                if (visit[now.value * 2] == 0) {
                    visit[now.value * 2] = now.count + 1;
                }
            }
        }


    }
}
