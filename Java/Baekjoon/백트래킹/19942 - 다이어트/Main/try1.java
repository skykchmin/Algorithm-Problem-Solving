import java.util.Scanner;

public class try1 {

    static int n;
    static int mp, mf, ms, mv;
    
    static int[][] food;

    static boolean[] visit;

    static boolean[] answerV; // 방문 인덱스

    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        try1 T = new try1();

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        mp = sc.nextInt();
        mf = sc.nextInt();
        ms = sc.nextInt();
        mv = sc.nextInt();

        food = new int[n][5];
        visit = new boolean[5 + 1];
        answerV = new boolean[n + 1];

        sc.nextLine();
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            String[] strings = s.split(" ");
            
            food[i][0] = Integer.parseInt(strings[0]);
            food[i][1] = Integer.parseInt(strings[1]);
            food[i][2] = Integer.parseInt(strings[2]);
            food[i][3] = Integer.parseInt(strings[3]);
            food[i][4] = Integer.parseInt(strings[4]);
        }
        
        T.solution();

        if (min == Integer.MAX_VALUE) {
            System.out.println(-1); // 조건 만족 조합이 없는 경우
        } else {
            System.out.println(min);
            for (int i = 1; i < answerV.length; i++) {
                if (answerV[i]) {
                    System.out.print(i + 1+ " ");
                }
            }
        }
    }

    private void solution() {
        boolean[] choose = new boolean[n + 1];

        dfs(0, 0, 0, 0, 0, 0, choose);
    }

    private void dfs(int depth, int p, int f, int s, int v, int price, boolean[] choose) {
        if(depth  == n){

            // 최솟값
            if(p >= mp && f >= mf && s >= ms && v >= mv){
                if(price <= min){
                    min = price;

                    answerV = new boolean[n + 1];
                    for(int i = 1; i < choose.length; i++){
                        answerV[i] = choose[i];
                    }
                }
            }

            return;
        }

        // 가격의 합이 최댓값보다 클 경우 멈춤
        if(price >= min){
            return;
        }

        // 중복 선택 X
        for(int i = depth; i < n; i++){
            if(visit[i] == false){
                visit[i] = true;
                // 선택했을 경우
                choose[i] = true;
                dfs(depth + 1, p + food[i][0], f + food[i][1], s + food[i][2], v + food[i][3], price + food[i][4], choose);
                visit[i] = false;
                choose[i] = false;

                // 선택하지 않을 경우
                dfs(depth + 1, p, f, s, v, price, choose);
            }
        }
    }
}

////////

//import java.util.Scanner;
//import java.math.*;
//
//public class Main {
//
//    static int n;
//    static int mp, mf, ms, mv;
//
//    static int[][] food;
//
//    static boolean[] visit;
//
//    static int min = Integer.MAX_VALUE;
//
//    public static void main(String[] args) {
//        Main T = new Main();
//
//        Scanner sc = new Scanner(System.in);
//
//        n = sc.nextInt();
//
//        mp = sc.nextInt();
//        mf = sc.nextInt();
//        ms = sc.nextInt();
//        mv = sc.nextInt();
//
//        food = new int[n][5];
//        visit = new boolean[5 + 1];
//
//        sc.nextLine();
//        for(int i = 0; i < n; i++){
//            String s = sc.nextLine();
//            String[] strings = s.split(" ");
//
//            food[i][0] = Integer.parseInt(strings[0]);
//            food[i][1] = Integer.parseInt(strings[1]);
//            food[i][2] = Integer.parseInt(strings[2]);
//            food[i][3] = Integer.parseInt(strings[3]);
//            food[i][4] = Integer.parseInt(strings[4]);
//        }
//
//        T.solution();
//        System.out.println(min);
//    }
//
//    private void solution() {
//        dfs(0, 0, 0, 0, 0, 0);
//    }
//
//    private void dfs(int depth, int p, int f, int s, int v, int price) {
//        if(depth  == n){
//
//            // 최솟값
//            if(p >= mp && f >= mf && s >= ms && v >= mv){
//                min = Math.min(price, min);
//            }
//
//            return;
//        }
//
//        // 가격의 합이 최댓값보다 클 경우 멈춤
//        if(price >= min){
//            return;
//        }
//
//        // 중복 선택 X
//        for(int i = depth; i < n; i++){
//            if(visit[i] == false){
//                visit[i] = true;
//                // 선택했을 경우
//                dfs(depth + 1, p + food[i][0], f + food[i][1], s + food[i][2], v + food[i][3], price + food[i][4]);
//                visit[i] = false;
//
//                // 선택하지 않을 경우
//                dfs(depth + 1, p, f, s, v, price);
//            }
//        }
//    }
//}
