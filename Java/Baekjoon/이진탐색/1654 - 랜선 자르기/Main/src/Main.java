import java.util.Scanner;

public class Main {

    static long[] arr;

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        sc.nextLine();

        arr = new long[N];

        long max = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        max++;
        
        T.solution(N, K, max);
    }

    private void solution(int N, int K, long max) {

        long min = 0; // 탐색 길이 최솟값
        long mid = 0;

        while (min < max){
            int count = 0;
            mid = ( min + max ) / 2;

            // 배열 갯수 만큼
            for(int i = 0; i < N; i++){
                count += arr[i] / mid; // 나눈 몫을 더함
            }

            // K보다 작다면 - 작게
            if(count < K) {
                max = mid;
            } else { // 같거나 크다면 +1 씩 늘린다.
                min = mid + 1;
            }
        }

        // 안될 때까지 돌렸으니 될때까지를 구한다
        System.out.println(min - 1);
    }
}
