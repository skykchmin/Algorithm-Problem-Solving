import java.util.Arrays;
import java.util.Scanner;

public class MainLecture {

    public static void main(String[] args) {
        MainLecture T = new MainLecture();
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
        int answer = 0;

        Arrays.sort(arr);

        int lt = 0;
        int rt = n - 1;

        while(lt <= rt){
            int mid = (lt + rt) / 2;
            if(arr[mid] == m){
                answer = mid + 1;
                break;
            }

            if(arr[mid] > m){
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        return answer;
    }
}
