import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    ArrayList<Integer>[] adjList;

    static boolean[] dv;

    static int n, m;

    static int count;

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        int[][] arr = new int[m][2];

        for(int i = 0 ; i < m; i++){
            String s = sc.nextLine();
            String[] strings = s.split(" ");
            arr[i][0] = Integer.parseInt(strings[0]);
            arr[i][1] = Integer.parseInt(strings[1]);
        }

        T.solution(arr);

        System.out.println(count - 1);
    }

    private void solution(int[][] arr) {

        adjList = new ArrayList[n + 1];
        dv = new boolean[n + 1];
        count = 0;

        // 인접 리스트 초기화
        for(int i = 0; i <= n; i++){
            adjList[i] = new ArrayList<>();
        }

        // 그래프 생성
        for(int i = 0; i < arr.length; i++){
            int from = arr[i][0];
            int to = arr[i][1];

            adjList[from].add(to);
            adjList[to].add(from);
        }

        dfs(1);
    }

    private void dfs(int now){

        // 방문 처리
        dv[now] = true;
        count++;

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
