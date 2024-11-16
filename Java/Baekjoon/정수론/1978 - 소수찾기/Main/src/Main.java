import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Main T = new Main();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int[] arr = new int[n];
        String s = reader.readLine();
        String[] strings = s.split(" ");

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(strings[i]);
        }

        int answer = T.solution(arr);
        System.out.println(answer);
    }

    private int solution(int[] arr) {
        int count = 0;

        for (int num : arr) { // 배열의 각 값을 순회
            if (num <= 1) {   // 1 이하의 숫자는 소수가 아님
                continue;
            }

            boolean isPrime = true;
            for (int j = 2; j * j <= num; j++) { // 소수 판별
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
            }
        }

        return count;
    }
}
