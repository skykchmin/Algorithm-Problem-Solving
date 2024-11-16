import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }

        main.solution(arr);
    }

    private void solution(int[] arr) {
        int[] T = new int[101]; // 1부터 1000까지

        // T
        for(int i = 1; i <= 100; i++){
            T[i] = i * (i + 1) / 2;
        }

        for(int n = 0; n < arr.length; n++){

            int answer = 0; // 가능 여부

            int target = arr[n];
            for(int i = 1; i < T.length  ; i++){
                for(int j = 1; j < T.length ; j++){
                    for(int k = 1; k < T.length ; k++){
                        if(T[i] + T[j] + T[k] > target){
                            continue;
                        }

                        if(T[i] + T[j] + T[k] == target){
                            answer = 1;
                            break;
                        }
                    }
                }
            }

            System.out.println(answer);
        }
    }
}
