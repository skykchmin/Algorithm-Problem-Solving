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

        for (int x : T.solution(n, arr)){
            System.out.println(x + " ");
        }
    }

    public int[] solution(int n, int[] arr) {
        for(int i = 1; i < n; i++){
            int temp = arr[i]; // 삽입되서 들어가는 것

            for(int j = i - 1; j >= 0; j--){
                if(arr[j] > temp){
                    arr[j+1] = arr[j];
                } else {
                    break;
                }

                arr[j+1] = temp;
            }

        }
    }
}
