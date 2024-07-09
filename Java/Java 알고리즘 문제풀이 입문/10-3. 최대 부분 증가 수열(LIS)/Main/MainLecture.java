import java.util.Scanner;

public class MainLecture {
    static int[] dy;

    public int solution(int[] arr) {
        int answer = 0;

        dy = new int[arr.length];
        dy[0] = 1;

        for(int i = 1; i < arr.length; i++){
            // i보다 작으면서 dy[i]의 가장 큰 값을 찾는다
            int max = 0;
            for(int j = 1; j >= 0; j--){
                if(arr[j] < arr[i] && dy[j] >= max){
                    max = dy[j];
                }
            }

            dy[i] = max + 1;
        }

        return answer;
    }


    public static void main(String[] args) {
        MainLecture T = new MainLecture();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(arr));
    }


}
