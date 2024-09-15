import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];

        for(int i = 0; i < 9; i++){
            String s = sc.nextLine();
            String[] strings = s.split(" ");

            for(int j = 0; j < 9; j++){
                arr[i][j] = Integer.parseInt(strings[j]);
            }
        }

        T.solution(arr);

    }

    public void solution(int[][] arr) {

        int max = Integer.MIN_VALUE;
        int row = 0;
        int col = 0;

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        row = row + 1;
        col = col + 1;

        System.out.println(max);
        System.out.println(row + " " + col);
    }
}
