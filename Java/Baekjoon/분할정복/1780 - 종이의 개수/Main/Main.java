import java.util.Scanner;

public class Main {

    static int[][] maps;

    static int minus, zero, plus;


    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        maps = new int[n][n];

        for(int i = 0; i < n; i++){
            String[] strings = sc.nextLine().split(" ");
            for(int j = 0; j < n; j++){
                maps[i][j] = Integer.parseInt(strings[j]);
            }
        }

        T.solution(n);
        System.out.println(minus);
        System.out.println(zero);
        System.out.println(plus);
    }

    public void solution(int n) {

        dfs(0, 0 , n);

    }

    public void dfs(int y, int x, int length){
        int basis = maps[y][x];

        if(length == 1){
            countColor(basis);

            return;
        }

        boolean isSame = true;
        for(int i = y; i < y + length; i++){
            for(int j = x; j < x + length; j++){
                if(basis != maps[i][j]){
                    isSame = false;
                    break;
                }
            }
        }

        // 종료 조건
        if(isSame){
            countColor(basis);

            return;
        }

        int n = length / 3;

        // 9등분
        dfs(y, x, n); // 왼쪽 위
        dfs(y, x + n, n); // 위쪽 가운데
        dfs(y, x + 2 * n, n); // 오른쪽 위
        dfs(y + n, x, n); // 왼쪽 가운데
        dfs(y + n, x + n, n); // 가운데
        dfs(y + n, x + 2 * n, n); // 오른쪽 가운데
        dfs(y + 2 * n, x, n); // 왼쪽 아래
        dfs(y + 2 * n, x + n, n); // 아래쪽 가운데
        dfs(y + 2 * n, x + 2 * n, n); // 오른쪽 아래

    }

    private static void countColor(int basis) {
        if(basis == -1){
            minus++;
        } else if(basis == 0){
            zero++;
        } else if(basis == 1){
            plus++;
        }
    }
}
