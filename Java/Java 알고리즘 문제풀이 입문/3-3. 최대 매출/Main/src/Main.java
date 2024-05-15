import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] strings = s.split(" ");
        int inputNum = Integer.parseInt(strings[0]);
        int a = Integer.parseInt(strings[1]);

        int[] arr = new int[inputNum];
        for(int i = 0; i < inputNum; i++){
            arr[i] = sc.nextInt();
        }

        int solution = T.solution(inputNum, a, arr);
        System.out.println(solution);
    }

    public int solution(int inputNum, int a, int[] arr) {
        int lp = 0;
        int rp = a - 1;

        int answer = 0;
        while(rp < inputNum){

            int temp = 0;
            for(int i = 0; i < a; i++){
                temp += arr[lp + i];
            }

            if(temp > answer){
                answer = temp;
            }

            lp++;
            rp++;
        }

        return answer;
    }
}