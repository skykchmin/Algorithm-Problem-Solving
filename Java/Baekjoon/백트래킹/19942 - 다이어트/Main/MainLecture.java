import java.util.Scanner;

public class MainLecture {
    static int n;
    static int mp, mf, ms, mv;
    static int[][] food;
    static boolean[] visit; // 방문 배열
    static boolean[] answerV; // 답을 저장할 배열
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        MainLecture T = new MainLecture();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        mp = sc.nextInt();
        mf = sc.nextInt();
        ms = sc.nextInt();
        mv = sc.nextInt();
        food = new int[n][5];
        visit = new boolean[n + 1]; // n + 1 크기로 수정
        answerV = new boolean[n + 1]; // n + 1 크기로 수정
        sc.nextLine();

        // 입력 처리
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] strings = s.split(" ");
            for (int j = 0; j < 5; j++) {
                food[i][j] = Integer.parseInt(strings[j]);
            }
        }

        // DFS를 통한 풀이 시작
        T.solution();

        // 결과 출력
        if (min == Integer.MAX_VALUE) {
            System.out.println(-1); // 조건 만족 조합이 없는 경우
        } else {
            System.out.println(min);

            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= n; i++) { // 1-based 인덱스 출력
                if (answerV[i]) {
                    sb.append(i + " ");
                }
            }

            System.out.println(sb.toString().trim());
        }
    }

    private void solution() {
        boolean[] choose = new boolean[n + 1]; // n + 1 크기
        dfs(0, 0, 0, 0, 0, 0, choose);
    }

    private void dfs(int depth, int p, int f, int s, int v, int price, boolean[] choose) {
        if (depth == n) {
            // 최솟값
            if (p >= mp && f >= mf && s >= ms && v >= mv) {
                if (price < min) {
                    min = price;
                    System.arraycopy(choose, 0, answerV, 0, n + 1); // answerV 배열 갱신
                }
            }
            return;
        }

        // 가격의 합이 최댓값보다 클 경우 멈춤
        if(price > min){
            return;
        }

        // 현재 음식을 선택한 경우
        choose[depth + 1] = true; // 1-based 인덱스로 설정
        dfs(depth + 1, p + food[depth][0], f + food[depth][1], s + food[depth][2], v + food[depth][3], price + food[depth][4], choose);

        // 현재 음식을 선택하지 않은 경우
        choose[depth + 1] = false; // 1-based 인덱스로 설정
        dfs(depth + 1, p, f, s, v, price, choose);
    }
}