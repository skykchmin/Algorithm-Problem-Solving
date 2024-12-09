import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        // 배열 크기 및 구간 합 계산 횟수 입력
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];

        sc.nextLine(); // 버퍼 비우기

        // 배열 값 입력받기
        String s = sc.nextLine();
        String[] strings = s.split(" ");
        int sum = 0;

        for (int i = 0; i < strings.length; i++) {
            sum += Integer.parseInt(strings[i]);
            arr[i + 1] = sum; // 누적합 저장
        }

        // 구간 합 계산 및 출력
        for (int i = 0; i < m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            T.solution(start, end, arr);
        }

        sc.close();
    }

    public void solution(int start, int end, int[] arr) {
        int sum = arr[end] - arr[start - 1];
        System.out.println(sum); // 결과 출력
    }
}
