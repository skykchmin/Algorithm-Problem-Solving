import java.util.Scanner;

public class MainLecture {
    static int n, m;
    static StringBuilder sb = new StringBuilder(); // 출력용 StringBuilder

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        T.solution();
        System.out.print(sb); // 한 번에 출력
    }

    public void solution() {
        int[] arr = new int[m + 1];
        int depth = 0;
        dfs(depth, arr);
    }

    private void dfs(int depth, int[] arr) {
        if (depth == m) {
            for (int i = 1; i <= m; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 1; i <= n; i++) {
            arr[depth + 1] = i;
            dfs(depth + 1, arr);
        }
    }
}