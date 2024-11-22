import java.util.Scanner;

public class Main {
    
    static int[][] arr;
    static int n;

    static int max = Integer.MIN_VALUE;
    
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        sc.nextLine();

        arr = new int[n + 1][2];

        for(int i = 1; i <= n; i++){
            String s = sc.nextLine();
            String[] strings = s.split(" ");
            arr[i][0] = Integer.parseInt(strings[0]);
            arr[i][1] = Integer.parseInt(strings[1]);
        }
        
        T.solution();
        System.out.println(max);
    }

    private void solution() {
        dfs(1, 0);
    }

    private void dfs(int day, int price) {
        // 기간 초과 조건
        if (day > n + 1) { // 기간 초과 시 종료 (n+1을 넘기면 상담 불가)
            return;
        }

        // 마지막 날까지 도달한 경우 최대값 갱신
        max = Math.max(max, price);

        // 상담하는 경우
        if (day <= n) {
            dfs(day + arr[day][0], price + arr[day][1]);
        }

        // 상담하지 않는 경우
        dfs(day + 1, price);
    }
}
