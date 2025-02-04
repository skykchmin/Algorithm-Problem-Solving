import java.util.Scanner;

public class Main {

    static int A, B, C;

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        T.solution();
    }

    public void solution() {
        int depth = 0;

        dfs(depth, 1);
    }

    public void dfs(int depth, int current) {
        if(depth == B){
            System.out.println(current);
            return;
        }

        int value = current * A % C;

        dfs(depth + 1, value);
    }
}
