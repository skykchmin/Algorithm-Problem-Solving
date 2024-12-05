import java.util.Scanner;

public class Main {

    static int min = Integer.MAX_VALUE;

    static int max = Integer.MIN_VALUE;

    static int calsNum;
    
    static int[] cals;

    static int[] num;

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        calsNum = n - 1;

        num = new int[n]; // 숫자
        String s1 = sc.nextLine();
        String[] string1 = s1.split(" ");

        for(int i = 0; i < string1.length; i++){
            num[i] = Integer.parseInt(string1[i]);
        }

        String s2 = sc.nextLine();
        String[] strings2 = s2.split(" ");
        cals = new int[4]; // 연산자
        for(int i = 0; i < 4; i++){
            cals[i] = Integer.parseInt(strings2[i]);
        }

        T.solution();
        System.out.println(max);
        System.out.println(min);
    }

    private void solution() {
        dfs(0, num[0]);
    }

    private void dfs(int depth, int sum) {
        // 연산자 갯수 모두 사용했다면
        if(depth == calsNum){
            max = Math.max(max, sum);
            min = Math.min(min, sum);

            return;
        }
        
        // 연산자
        for(int i = 0; i < 4; i++){
            if(cals[i] == 0){
                continue;
            }

            cals[i] -= 1;

            // 사칙연산 결과를 별도로 계산
            int nextSum = 0;
            if(i == 0){
                nextSum = sum + num[depth + 1];
            } else if (i == 1) {
                nextSum = sum - num[depth + 1];
            } else if (i == 2) {
                nextSum = sum * num[depth + 1];
            } else if (i == 3) {
                nextSum = sum / num[depth + 1];
            }

            dfs(depth + 1, nextSum);
            cals[i] += 1;
        }
    }
}
