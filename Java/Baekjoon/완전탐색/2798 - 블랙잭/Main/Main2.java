import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Main2 T = new Main2();

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        String[] input = sc.nextLine().split(" ");

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            arr.add(Integer.parseInt(input[i]));
        }

        int answer = T.solution(arr, M);
        System.out.println(answer);
        sc.close();
    }

    private int solution(List<Integer> arr, int m) {

        int max = 0;

        for(int a : arr){
            for(int b : arr){
                for(int c : arr){
                    // 중복되서 뽑으면 안된다
                    if(a == b || b == c || c == a){
                        continue;
                    }

                    // 합이 M과 가까워야함
                    if(a + b + c <= m){
                        max = Math.max(max, a + b + c);
                    }
                }
            }
        }

        return max;
    }
}
