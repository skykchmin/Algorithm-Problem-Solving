import java.util.Scanner;

public class Main {

    static int n, m;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        T.solution();
        System.out.println(sb.toString());
    }

    public void solution() {

        int[] arr = new int[m + 1];

        dfs(0, 1, arr);
    }

    private void dfs(int depth, int start, int[] arr) {
        if(depth == m){
            for(int i = 1; i < arr.length; i++){
                sb.append(arr[i] + " ");
            }

            sb.append("\n");
            return;
        }

        for(int i = start; i <= n; i++){
            arr[depth + 1] = i;
            dfs(depth + 1, i, arr);
        }
    }
}
