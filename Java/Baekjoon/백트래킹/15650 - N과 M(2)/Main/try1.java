import java.util.*;

public class try1 {
    static int n, m;
    static boolean[] visit;

    public static void main(String[] args) {
        try1 T = new try1();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        T.solution();
    }

    public void solution() {
        int[] arr = new int[m + 1]; // 크기를 m + 1로 유지
        visit = new boolean[n + 1];
        dfs(0, 1, arr);
    }

    private void dfs(int depth, int start, int[] arr) {
        if (depth == m) { // 깊이가 m에 도달하면
            for (int i = 1; i <= m; i++) { // 1부터 m까지 출력
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= n; i++) {
            if (visit[i]) { // 이미 방문한 경우 건너뛰기
                continue;
            }
            visit[i] = true; // 방문 표시
            arr[depth + 1] = i; // 1-based 인덱스에 숫자 저장
            dfs(depth + 1, i + 1, arr); // 다음 숫자는 i + 1부터
            visit[i] = false; // 백트래킹 시 방문 해제
        }
    }
}