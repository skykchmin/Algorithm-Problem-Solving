import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] answer = T.solution(num);

        for(int i = 0; i < answer.length; i++){
            System.out.print(answer[i] + " ");
        }
    }

    public int[] solution(int num) {
        int[] answer = new int[2];

        int[] arr = new int[num];

        arr[0] = 1;
        arr[1] = 1;

        for(int i = 2; i < num; i++){
            arr[i] = arr[i-2] + arr[i-1];
        }

        answer[0] = arr[num-1];
        answer[1] = num - 2;

        return answer;

    }
}

