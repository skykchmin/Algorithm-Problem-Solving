import java.util.Scanner;

public class try1 {

    static int[][] dp;
    static int[][] maps;

    public static void main(String[] args) {
        try1 T = new try1();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        sc.nextLine();

        maps = new int[n][n];
        dp = new int[n + 1][n + 1];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] strings = s.split(" ");
            for (int j = 0; j < n; j++) {
                maps[i][j] = Integer.parseInt(strings[j]);
                sum += Integer.parseInt(strings[j]);
                dp[i][j] = sum;
            }
        }

        for (int i = 0; i < m; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();

            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int answer = T.solution(x1, y1, x2, y2);
            System.out.println(answer);
        }
    }

    private int solution(int x1, int y1, int x2, int y2) {
        if (x1 == x2 && y1 == y2) {
            return maps[x1 - 1][y1 - 1];
        }

        return dp[x2 - 1][y2 - 1] - dp[x1 - 1][y1 - 1];
    }
}
