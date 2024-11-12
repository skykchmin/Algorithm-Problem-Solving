import java.util.Scanner;

public class Main {
    static char[][] maps;
    static int n;
    static int rowAnswer = 0;
    static int colAnswer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        maps = new char[n][n];

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < n; j++) {
                maps[i][j] = line.charAt(j);
            }
        }

        solution();
        System.out.println(rowAnswer);
        System.out.println(colAnswer);
    }

    private static void solution() {
        // Row checking for horizontal spaces
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (maps[i][j] == '.') {
                    count++;
                } else {
                    if (count >= 2) {
                        rowAnswer++;
                    }
                    count = 0;
                }
            }

            if (count >= 2) {
                rowAnswer++;
            }
        }

        // Column checking for vertical spaces
        for (int j = 0; j < n; j++) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (maps[i][j] == '.') {
                    count++;
                } else {
                    if (count >= 2) {
                        colAnswer++;
                    }
                    count = 0;
                }
            }

            if (count >= 2) {
                colAnswer++;
            }
        }
    }
}