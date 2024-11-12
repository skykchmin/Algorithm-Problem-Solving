import java.util.Scanner;

public class Main {

    static final int[] num = {1, 2, 3};
    static int count = 0;
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int target = sc.nextInt();
            T.solution(target);
            System.out.println(count);
            count = 0;
        }


    }

    private void solution(int target) {
        dfs(target, 0, 0);
    }

    private void dfs(int target, int now, int sum){
        int temp = sum + now;

        // 종료 조건
        if(target == temp){
            count++;
            return;
        } else if (temp > target) {
            return;
        } else { // 작을 경우
            for(int i = 0; i < 3; i++){
                dfs(target, num[i], temp);
            }
        }
    }
}
