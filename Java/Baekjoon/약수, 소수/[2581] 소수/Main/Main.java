import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        T.solution(m, n);

    }

    private void solution(int m, int n) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();

        for(int i = m; i <= n; i++){
            boolean isPrime = true;
            for(int j = 2; j * j <= i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            // 소수이고 1이상
            if(isPrime == true && i > 1){
                list.add(i);
            }
        }

        if(list.isEmpty()){
            System.out.println("-1");
            return;
        }

        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }

        Integer min = Collections.min(list);


        System.out.println(sum);
        System.out.println(min);
    }
}
