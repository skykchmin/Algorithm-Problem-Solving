import java.util.Scanner;

public class Main2 {

    static int n;
    static int m;

    public static void main(String[] args) {
        Main2 T = new Main2();

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        T.solution();
    }

    private void solution() {
        int[] arr = new int[m + 1];

        dfs(0, 1, arr);
    }

    private void dfs(int depth, int start, int[] arr) {
        if(depth == m){
            for(int i = 1; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = start; i <= n; i++){
            arr[depth + 1] = i;
            dfs(depth + 1, i, arr);
        }
    }
}
