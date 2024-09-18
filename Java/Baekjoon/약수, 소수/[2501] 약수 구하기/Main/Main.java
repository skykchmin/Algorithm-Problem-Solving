import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int answer = T.solution(N, K);
        System.out.println(answer);
    }

    private int solution(int n, int k) {

        List<Integer> arr = new ArrayList<>();

        int sqrt = (int) Math.sqrt(n);
        for(int i = 1; i <= sqrt; i++){
            if(n % i == 0){
                arr.add(i);

                // 나머지 반쪽
                if(i != n / sqrt){
                    arr.add(n / i);
                }
            }
        }

        Collections.sort(arr);

        if(arr.size() < k){
            return 0;
        } else {
            return arr.get(k - 1);
        }
    }

    private int solution2(int n, int k) {
        int answer = 0;

        List<Integer> divisors = new ArrayList<>();

        // 1부터 n의 제곱근까지 약수를 찾는다.
        for (int i = 1; i * i <= n; i++) {
            // n이 i로 나누어 떨어질 경우, i는 약수이다.
            if (n % i == 0) {
                divisors.add(i); // 약수 i를 리스트에 추가한다.
                // i가 n의 제곱근이 아닐 경우, n / i도 약수이다.
                if (i != n / i) {
                    divisors.add(n / i); // n / i를 리스트에 추가한다.
                }
            }
        }

        Collections.sort(divisors);

        if(divisors.size() < k){
            return 0;
        } else {
            return divisors.get(k - 1);
        }
    }
}
