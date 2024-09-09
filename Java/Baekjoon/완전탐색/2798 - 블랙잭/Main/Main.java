import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();  // 이전 입력의 개행 문자 처리

        String[] input = sc.nextLine().split(" ");

        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int answer = T.solution(arr, M);
        System.out.println(answer);
        sc.close();
    }

    private int solution(int[] arr, int M) {

        List<Integer> intList = Arrays.stream(arr)  // IntStream 생성
                .boxed()      // 각 int 요소를 Integer로 박싱
                .collect(Collectors.toList());  // List<Integer>로 변환

        Collections.sort(intList);

        int max = 0;
        for (int i = 0; i < arr.length - 2; i++) {  // 첫 번째 숫자
            for (int j = i + 1; j < arr.length - 1; j++) {  // 두 번째 숫자
                for (int k = j + 1; k < arr.length; k++) {  // 세 번째 숫자
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum <= M) {
                        max = Math.max(max, sum);  // 최대값 갱신
                    }
                }
            }
        }

        return max;
    }
}
