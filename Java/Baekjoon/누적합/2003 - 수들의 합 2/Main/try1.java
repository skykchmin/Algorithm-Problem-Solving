import java.util.Scanner;

public class try1 {
    public static void main(String[] args) {
        try1 T = new try1();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        sc.nextLine();

        String s = sc.nextLine();
        String[] strings = s.split(" ");

        int[] arr = new int[n];

        for(int i = 0; i < strings.length; i++){
            arr[i] = Integer.parseInt(strings[i]);
        }

        int answer = T.solution(n, k, arr);
        System.out.println(answer);
    }

    private int solution(int n, int k, int[] arr) {
        int lt = 0; // 왼쪽 포인터
        int sum = 0; // 현재 부분합
        int count = 0; // 목표 합을 만드는 부분 배열의 수

        for (int rt = 0; rt < n; rt++) { // 오른쪽 포인터 확장
            sum += arr[rt]; // 현재 값을 더함

            // 합이 목표보다 클 경우, 왼쪽 포인터 이동
            while (sum > k) {
                sum -= arr[lt];
                lt++;
            }

            // 합이 목표와 같다면, 부분 배열 카운트 증가
            if (sum == k) {
                count++;
            }
        }

        return count;
    }
}
