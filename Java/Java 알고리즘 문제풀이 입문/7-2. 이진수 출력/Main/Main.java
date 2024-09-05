import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        T.DFS(N);
    }

    private void DFS(int n) {
        if(n == 0){
            return;
        }

        DFS(n / 2);
        System.out.print(n % 2);
    }
}

