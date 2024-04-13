import java.util.Scanner;

public class Main {

    public int solution(int[] inputNums) {
        if(inputNums.length == 1){
            return 1;
        }

        int answer = 1;
        int max = inputNums[0];
        for(int i = 0; i < inputNums.length - 1; i++){
            if(max < inputNums[i+1]){
                max = inputNums[i+1];
                answer += 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int[] inputNums = new int[inputNum];
        for(int i = 0; i < inputNum; i++){
            int nextInt = sc.nextInt();
            inputNums[i] = nextInt;
        }

        sc.close();

        int solution = T.solution(inputNums);
        System.out.println(solution);
    }

}
