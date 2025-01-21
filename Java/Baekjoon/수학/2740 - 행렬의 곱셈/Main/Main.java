import java.util.Scanner;

public class Main {

    static int n, m, M, K;

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        sc.nextLine();

        int[][] arr1 = new int[n][m];

        for(int i = 0; i < n; i++){
            String[] strings = sc.nextLine().split(" ");
            for(int j = 0; j < m; j++){
                arr1[i][j] = Integer.parseInt(strings[j]);
            }
        }

        M = sc.nextInt();
        K = sc.nextInt();

        sc.nextLine();

        int[][] arr2 = new int[M][K];
        for(int i = 0; i < M; i++){
            String[] strings = sc.nextLine().split(" ");
            for(int j = 0; j < K; j++){
                arr2[i][j] = Integer.parseInt(strings[j]);
            }
        }

        T.solution(arr1, arr2);

    }

    public void solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[n][K];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < K; j++){
                for(int k = 0; k < M; k++) {	// 더해주는 원소의 개수는 총 M개다.
                    // A의 i번째 row의 k번째 열 원소와, B의 j번째 col의 k번째 행 원소를 곱한 뒤 누적합
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < K; j++){
                System.out.print(answer[i][j] + " ");
            }

            System.out.println();
        }
    }
}
