import java.util.Arrays;
import java.util.Scanner;

public class MainLecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] arrN = new long[N];

        for (int i = 0; i < N; i++) {
            arrN[i] = sc.nextLong();
        }

        Arrays.sort(arrN);

        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            long query = sc.nextLong();
            if (binarySearch(arrN, query)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static boolean binarySearch(long[] arr, long target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}

