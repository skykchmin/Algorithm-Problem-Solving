import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] arr = new long[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLong();
        }

        String[] solution = T.solution(arr);

        for (String s : solution) {
            System.out.println(s);
        }
    }

    public String[] solution(long[] arr) {
        String[] answer = new String[arr.length];

        for(int i = 0; i < arr.length; i++){
            for(int j = 2; j <= 1000000; j++){
                if(arr[i] % j == 0){
                    answer[i] = "NO";
                    break;
                }

                if(j == 1000000){
                    answer[i] = "YES";
                }
            }
        }

        return answer;
    }
}
