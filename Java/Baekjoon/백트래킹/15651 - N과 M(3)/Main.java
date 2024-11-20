import java.util.Scanner;

public class Main {

    static int n, m;

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        T.solution();
    }

    public void solution() {
        int[] arr = new int[m + 1];
        int depth = 0;

        dfs(depth, arr);
    }

    private void dfs(int depth, int[] arr) {
        if(depth == m){
            for(int i = 1; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 1; i <= n; i++){
            arr[depth + 1] = i;

            dfs(depth + 1, arr);
        }
    }
}
