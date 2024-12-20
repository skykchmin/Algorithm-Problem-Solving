import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();

        sc.nextLine();

        int[] arr = new int[n];
        String[] strings = sc.nextLine().split(" ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(strings[i]);
        }

        int answer = T.solution(s, arr);
        System.out.println(answer);
    }

    private int solution(int s, int[] arr) {
        int min = Integer.MAX_VALUE;

        int lt = 0;

        int sum = 0;
        for(int rt = 0; rt < arr.length; rt++){
            sum += arr[rt];

            while (sum >= s){
                int count = rt - lt + 1; // 인덱스끼리 뺀다음 + 1

                min = Math.min(min, count);

                sum -= arr[lt];
                lt++;
            }
        }

        if(min == Integer.MAX_VALUE){
            min = 0;
        }

        return min;
    }
}
