import java.util.Scanner;

public class Main {

    static int answer = 1;
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        T.dfs(N);
        System.out.println(answer);
    }

    public void dfs(int N){
        if(N == 0){
            return;
        }

        answer = answer * N;
        dfs(N - 1);

    }
}
