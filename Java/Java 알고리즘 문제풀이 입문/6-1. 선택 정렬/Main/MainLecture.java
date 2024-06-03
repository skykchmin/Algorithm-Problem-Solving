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

        T.solution(n, arr);

    }

    public void solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++){
            int idx = 1;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[idx]){
                    idx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
    }
}
