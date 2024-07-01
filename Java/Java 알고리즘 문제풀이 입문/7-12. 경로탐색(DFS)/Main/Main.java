import java.util.Scanner;

public class Main {

    static int n, m, answer;

    static int[][] graph;
    static int[] ch;
    public void DFS(int v){
        if(v == n){
            answer++;
        } else {
            // n번 노드까지 반복
            for(int i = 1; i<= n; i++){
                // i가 1인 노드와 이미 방문하지 않은 노드
                if(graph[v][i] == 1 && ch[i] == 0){
                    ch[i] = 1;
                    DFS(i);

                    // 뒤로 back을 하면 체크를 취소해야한다
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        graph = new int[n+1][n+1];
        ch = new int[n+1];

        for (int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph[a][b] = 1;
        }

        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);

    }
}
