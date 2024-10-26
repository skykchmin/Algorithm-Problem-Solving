import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    static long[] arrN;
    static long[] arrM;

    static int N, M;

    public static void main(String[] args) {
        Main2 T = new Main2();

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        sc.nextLine();

        arrN = new long[N];
        String s = sc.nextLine();
        String[] stringN = s.split(" ");
        for(int i = 0; i < N; i++){
            arrN[i] = Long.parseLong(stringN[i]);
        }

        M = sc.nextInt();
        sc.nextLine();

        arrM = new long[M];
        String s2 = sc.nextLine();
        String[] stringM = s2.split(" ");
        for(int i = 0; i < M; i++){
            arrM[i] = Long.parseLong(stringM[i]);
        }

        T.solution();
    }

    private void solution() {

        // 이분 탐색을 위한 정렬
        Arrays.sort(arrN);

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < M; i++){
            int maxIndex = upperBound(arrM[i]);
            int minIndex = lowerBound(arrM[i]);

            int count = maxIndex - minIndex;

            sb.append(count + " ");
        }

        System.out.println(sb.toString());
    }

    private int lowerBound(long target) {
        int lt = 0;
        int rt = N;

        while(lt < rt){
            int mid = (lt + rt) / 2;

            if (arrN[mid] < target) {
                lt = mid + 1;
            } else {
                rt = mid;
            }
        }

        return lt;
    }

    private int upperBound(long target) {
        int lt = 0;
        int rt = N;

        while(lt < rt){
            int mid = (lt + rt) / 2;

            if (arrN[mid] <= target) {
                lt = mid + 1;
            } else {
                rt = mid;
            }
        }

        return lt;
    }
}
