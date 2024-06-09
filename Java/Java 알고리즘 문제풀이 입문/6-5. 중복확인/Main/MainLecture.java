import java.util.Arrays;
import java.util.Scanner;

public class MainLecture {
    public static void main(String[] args) {
        MainLecture T = new MainLecture();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        String answer = T.solution(n, arr);
        System.out.println(answer);
    }

    private String solution(int n, int[] arr) {
        String answer = "U";

        Arrays.sort(arr);
        for(int i = 0; i < n - 1; i++ ){
            if(arr[i] == arr[i + 1]){
                return "D";
            }
        }

        return answer;
    }
}
