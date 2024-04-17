import java.util.Scanner;

public class Main {

    public int solution(int n, int[][] inputNumbers) {
        int max = 0;


        for(int i = 0; i < n; i++){
            int temp = 0;

            for(int j = 0; j < n; j++){
                temp += inputNumbers[i][j];
            }

            if(temp > max){
                max = temp;
            }
        }

        int cross1 = 0;
        int cross2 = 0;
        for(int m = 0; m < n; m++){
            cross1 += inputNumbers[m][m];
            cross2 += inputNumbers[m][n - m - 1];
        }

        if(max < cross1){
            max = cross1;
        }

        if(max < cross2){
            max = cross2;
        }

        return max;
    }

    public int solutionLecture(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;
        for(int i = 0; i < n; i++){
            sum1 = 0;
            sum2 = 0;
            for(int j = 0; j < n; j++){
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer=Math.max(answer, sum1);
            answer=Math.max(answer, sum2);
        }

        sum1=sum2=0;
        for(int i = 0; i < n; i++){
            sum1 += arr[i][i];
            sum2 += arr[i][n-i-1];
        }
        answer=Math.max(answer, sum1);
        answer=Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] inputNumbers = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                inputNumbers[i][j] = sc.nextInt();
            }
        }

        int result = T.solutionLecture(n, inputNumbers);
        System.out.println(result);
    }


}
