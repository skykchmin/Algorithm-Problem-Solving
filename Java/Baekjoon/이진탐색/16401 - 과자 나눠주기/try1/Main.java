import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    
    
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[n];
        String s = sc.nextLine();
        String[] strings = s.split(" ");
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(strings[i]);
        }

        int answer = T.solution(m, arr);
        System.out.println(answer);
    }

    private int solution(int m, int[] arr) {
        // 배열 정렬
        Arrays.sort(arr);

        int lt = 1; // 최소 길이
        int rt = arr[arr.length - 1];
        int max = 0;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            int count = 0;

            for (int num : arr) {
                count += num / mid;
            }

            if (count >= m) {
                // m개 이상 만들 수 있다면 더 큰 길이를 시도
                max = mid;
                lt = mid + 1;
            } else {
                // m개 미만이라면 더 작은 길이를 시도
                rt = mid - 1;
            }
        }

        return max;
    }
}
