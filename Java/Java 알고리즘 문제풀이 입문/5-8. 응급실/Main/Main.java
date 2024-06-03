import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arr = new int[a];

        for(int i = 0; i < a; i++){
            arr[i] = sc.nextInt();
        }

        T.solution(a, b, arr);
    }

    public int solution(int a, int b, int[] arr) {
        int answer = 0;

        int target = arr[b];

        LinkedList<Integer> queue = new LinkedList<>();

        // 초기 셋팅
        for(int i = 0; i < arr.length; i++){
            queue.offer(arr[i]);
        }


        return answer;
    }
}
