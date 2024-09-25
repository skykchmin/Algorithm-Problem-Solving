import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    static ArrayList<Integer>[] adjustList;
    static ArrayList<Integer> answer;

    static boolean[] visited;

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int start = sc.nextInt();

        sc.nextLine();

        int[][] graph = new int[N][2];

        for(int i = 0; i < N; i++){
            String[] temp = sc.nextLine().split(" ");
            graph[i][0] = Integer.parseInt(temp[0]);
            graph[i][1] = Integer.parseInt(temp[1]);
        }

        T.solution(N, start, graph);
    }


    public void solution(int n, int start, int[][] graph) {

        boolean[] v = new boolean[n + 1];
        adjustList = new ArrayList[n + 1];

        // 인접 리스트 초기화
        for(int i = 0; i < adjustList.length; i++){
            adjustList[i] = new ArrayList<>();
        }

        // 그래프 생성
        for(int i = 0; i < graph.length; i++){
            int from = graph[i][0];
            int to = graph[i][1];

            adjustList[from].add(to);
        }

        answer = new ArrayList<>();
    }

    public static void dfs(int now){
        visited[now] = true; // 현재 노드를 방문했음을 저장
        answer.add(now); // 현재 노드를 결과 리스트에 추가

        for(int next: adjustList[now]){
            if(!visited[next]){
                dfs(next);
            }
        }

    }
}
