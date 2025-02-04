import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] cards = new int[n][5];

        for(int i = 0; i < n; i++){
            String[] strings = sc.nextLine().split(" ");
            for(int j = 0; j < 5; j++){
                cards[i][j] = Integer.parseInt(strings[j]);
            }
        }

        int answer = T.solution(n, cards);
        System.out.println(answer + 1);
    }

    public int solution(int n, int[][] cards) {
        int max = Integer.MIN_VALUE;
        int idx = 0;

        for(int i = 0; i < n; i++){
            int temp = select(cards[i]);

            if(temp == max){
                if(idx < i){
                    max = temp;
                    idx = i;
                }
            }

            if(temp > max){
                max = temp;
                idx = i;
            }
        }

        return idx;
    }

    public int select(int[] arr) {
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < 5; i++){
            for(int j = i + 1; j < 5; j++){
                for(int k = j + 1; k < 5; k++){
                    int temp = ( arr[i] + arr[j] + arr[k] ) % 10;

                    max = Math.max(temp, max);
                }
            }
        }

        return max;
    }
}
