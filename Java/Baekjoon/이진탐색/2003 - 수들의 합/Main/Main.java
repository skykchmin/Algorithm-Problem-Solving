import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        sc.nextLine();

        int[] arr = new int[n];
        String s = sc.nextLine();
        String[] strings = s.split(" ");
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(strings[i]);
        }

        int answer = T.solution(arr, m);
        System.out.println(answer);
    }

    private int solution(int[] arr, int m) {

        int count = 0;
        int sum = 0;
        int lt = 0;

        for(int rt = 0; rt < arr.length; rt++){
            sum += arr[rt];

            while (sum >= m){
                if(sum == m){
                    count++;
                }

                sum -= arr[lt];
                lt++;
            }
        }

        return count;
    }
}
