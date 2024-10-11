import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {

    static ArrayList<Integer>[] adjList;
    static boolean[] dv;
    static boolean[] bv;

    static ArrayList<Integer> dfsAnswer;
    static ArrayList<Integer> bfsAnswer;

    public static void main(String[] args) {
        Main1 T = new Main1();

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int start = sc.nextInt();
        sc.nextLine();

        int[][] arr = new int[M][2];

        for(int i = 0; i < M; i++){
            String s = sc.nextLine();
            String[] strings = s.split(" ");
            int from = Integer.parseInt(strings[0]);
            int to = Integer.parseInt(strings[1]);

            arr[i][0] = from;
            arr[i][1] = to;
        }

        T.solution(N, arr, start);
    }

    void solution(int n, int[][] arr, int start) {

        adjList = new ArrayList[n + 1];
        dv = new boolean[n + 1];
        bv = new boolean[n + 1];
        dfsAnswer = new ArrayList<>();
        bfsAnswer = new ArrayList<>();

        // 그래프 초기화
        for(int i = 0; i <= n; i++){
            adjList[i] = new ArrayList<>();
        }

        // 그래프 생성
        for(int i = 0; i < arr.length; i++){
            int from = arr[i][0];
            int to = arr[i][1];

            adjList[from].add(to);
        }

        dfs(start);
        bfs(start);

        for(int dfs : dfsAnswer){
            System.out.print(dfs + " ");
        }

        System.out.println();

        for(int bfs : bfsAnswer){
            System.out.print(bfs + " ");
        }

    }

    private void bfs(int now) {

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(now);

        // 큐가 비어있을 때까지
        while(!queue.isEmpty()){
            Integer poll = queue.poll();
            bfsAnswer.add(poll);

            for(int to : adjList[poll]){
                if(bv[to] != true && !queue.contains(to)){
                    queue.offer(to);
                    bv[to] = true; // 방문 처리
                }
            }
        }
    }

    private void dfs(int now) {
        // 방문 처리
        dv[now] = true;
        dfsAnswer.add(now); // 현재 노드를 결과에 추가

        // 인접 리스트가 없다면
        if(adjList[now] == null){
            return;
        }

        for(int to : adjList[now]){
            if(!dv[to]){
                dfs(to);
            }
        }
    }
}
