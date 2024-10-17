import java.util.Scanner;

public class Main {
    static boolean isFind = false;

    static long a, b;

    static long min = Long.MAX_VALUE;

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        a = sc.nextLong();
        b = sc.nextLong();

        T.solution();

    }

    void solution() {
        dfs(a, 1);

        if(isFind){
            System.out.println(min);
        } else {
            System.out.println("-1");
        }
    }

    private void dfs(long now, long count) {
        if(isFind){
            return;
        }

        // 찾았을 경우 or 커질경우
        if(now == b){
            isFind = true;
            min = Math.min(count, min);
            return;
        }

        if(now > b){
            return;
        }

        dfs(now * 2, count + 1);
        dfs(now * 10 + 1, count + 1);

    }
}
