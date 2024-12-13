import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();

        int N = sc.nextInt();
        int M = sc.nextInt();

        int answer = T.solution2(H, W, N, M);
        System.out.println(answer);
    }

//    public int solution(int H, int W, int N, int M) {
//
//        int count = 0;
//
//        for(int i = 0; i < H; i++){
//            for(int j = 0; j < W; j++){
//                if(i % (N + 1) == 0 && (j % (M + 1) == 0)){
//                    count++;
//                }
//            }
//        }
//
//        return count;
//    }

    public int solution2(int H, int W, int N, int M) {
        int rowCount = (H + N) / (N + 1); // 선택된 행의 수
        int colCount = (W + M) / (M + 1); // 선택된 열의 수
        return rowCount * colCount;      // 전체 셀의 개수
    }
}
