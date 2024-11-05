import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int[] arr =new int[n];
        String s = sc.nextLine();
        String[] strings = s.split(" ");
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(strings[i]);
        }

        int x = sc.nextInt();

        int answer = T.solution(n, x, arr);
        System.out.println(answer);
    }

    private int solution(int n, int x, int[] arr) {
        int count = 0;

        // 정렬
        Arrays.sort(arr);

        int lt = 0;
        int rt = n - 1;

        while (lt < rt){
            int sum = arr[lt] + arr[rt];

            if (sum == x) {
                count++;
                lt++;
                rt--;
            } else if (sum < x) {
                lt++;
            } else {
                rt--;
            }
        }

        return count;
    }
}
