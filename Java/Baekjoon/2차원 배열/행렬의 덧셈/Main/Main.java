import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arrA = new int[n][m];
        int[][] arrB = new int[n][m];

        sc.nextLine();

        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            String[] strings = s.split(" ");

            for (int j = 0; j < m; j++) {
                arrA[i][j] = Integer.parseInt(strings[j]);
            }
        }

        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            String[] strings = s.split(" ");

            for (int j = 0; j < m; j++) {
                arrB[i][j] = Integer.parseInt(strings[j]);
            }
        }

        int sum = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                sum = arrA[i][j] + arrB[i][j];
                System.out.print(sum + " ");
            }
            System.out.println();
        }

    }
}
