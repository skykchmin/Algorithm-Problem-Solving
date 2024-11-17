import java.util.Scanner;

public class try1 {

    static boolean[] visit;
    static int[] arr;
    public static void main(String[] args) {
        try1 T = new try1();

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        T.solution(N, M);
    }

    private void solution(int n, int m) {


        visit = new boolean[n];
        arr = new int[m];

        dfs(n, m, 0);
    }

    private void dfs(int n, int m, int depth) {

        // 재귀 길이가 같아지면 탐색과정에서 담았던 배열을 출력
        if(depth == m){
            for(int val : arr){
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 0; i < n; i++){
            if(visit[i] == true){
                continue;
            }

            visit[i] = true;		// 해당 노드를 방문상태로 변경
            arr[depth] = i + 1;		// 해당 깊이를 index로 하여 i + 1 값 저장
            dfs(n, m, depth + 1);	// 다음 자식 노드 방문을 위해 depth 1 증가시키면서 재귀호출

            // 자식노드 방문이 끝나고 돌아오면 방문노드를 방문하지 않은 상태로 변경
            visit[i] = false;
        }
    }


}
