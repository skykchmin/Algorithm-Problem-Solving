import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long answer = T.solution(n);
        System.out.println(answer);
    }

    public long solution(int n) {
        long[] arr = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for( int i =2; i<= n; i++){
            arr[i] = arr[i-1]+arr[i-2];
        }

        return arr[n];
    }
}
