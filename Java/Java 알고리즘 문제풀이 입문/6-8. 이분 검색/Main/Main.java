import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int answer = T.solution(n, m, arr);
        System.out.println(answer);
    }

    public int solution(int n, int m, int[] arr) {

        Arrays.sort(arr);

        int lt = 0;
        int rt = n - 1;

        int count = 1;
        while (lt <= rt){
            int temp = (lt + rt) / 2;
            if(arr[temp] == m){
                break;
            } else if (arr[temp] < m) {
                lt = temp + 1;  // 중간 값이 목표 값보다 작으면 lt를 중간 값 다음으로 이동
            } else {
                rt = temp - 1;  // 중간 값이 목표 값보다 크면 rt를 중간 값 이전으로 이동
            }
            count++;
        }

        return count;
    }
}
