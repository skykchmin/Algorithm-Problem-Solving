//import java.util.Scanner;
//
//public class Main {
////    public static void main(String[] args) {
////        Main T = new Main();
////
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////
////        int answer = T.dfs(n);
////        System.out.println(answer);
////    }
////
////    private int dfs(int now) {
////        if(now == 1){
////            return 0;
////        }
////
////        if(now % 3 == 0){
////            return dfs(now / 3) + 1;
////        } else if(now % 2 == 0){
////            return dfs(now / 2) + 1;
////        } else {
////            return dfs(now - 1) + 1;
////        }
////    }
//
//    static int min = Integer.MAX_VALUE;
//
//    static int[] dp;
//
//    public static void main(String[] args) {
//        Main T = new Main();
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        dp = new int[n + 1];
//
//        T.dfs(1, n, 0);
//        System.out.println(min);
//    }
//
//    private void dfs(int now, int n, int count) {
//        if(now == n){
//            min = Math.min(count, min);
//            return;
//        }
//
//        if(now > n){
//            return;
//        }
//
//
//
//        dfs(now * 3, n, count + 1);
//        dfs(now * 2, n, count + 1);
//        dfs(now + 1, n, count + 1);
//    }
//}

import java.util.Scanner;

public class Main {
    static int[] dp; // 메모이제이션 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n + 1]; // 초기화

        for (int i = 0; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE; // 최대값으로 초기화
        }

        System.out.println(dfs(n));
    }

    private static int dfs(int now) {
        if (now == 1) {
            return 0; // 1이 되면 종료
        }

        if (dp[now] != Integer.MAX_VALUE) {
            return dp[now]; // 이미 계산된 경우 값 반환
        }

        int result = Integer.MAX_VALUE;

        // 3으로 나눌 수 있는 경우
        if (now % 3 == 0) {
            result = Math.min(result, dfs(now / 3) + 1);
        }

        // 2로 나눌 수 있는 경우
        if (now % 2 == 0) {
            result = Math.min(result, dfs(now / 2) + 1);
        }

        // 1을 빼는 경우
        result = Math.min(result, dfs(now - 1) + 1);

        dp[now] = result; // 메모이제이션
        return result;
    }
}