import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        T.solution(N);
    }

    public void DFS(int n){
        if(n == 0){
            return;
        } else {
            DFS(n - 1);
            System.out.println(n);
        }
    }

    public void solution(int n) {
        DFS(3);
    }
}
