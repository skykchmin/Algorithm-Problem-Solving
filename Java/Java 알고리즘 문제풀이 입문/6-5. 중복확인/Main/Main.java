import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        String answer = T.solution(n, arr);
        System.out.println(answer);
    }

    public String solution(int n, int[] arr) {
        String answer = "U";

        Arrays.sort(arr);

        int temp = arr[0];
        for(int i = 1; i < n; i++){
            if(temp == arr[i]){
                answer = "D";
                break;
            } else {
                temp = arr[i];
            }
        }

        return answer;
    }
}
