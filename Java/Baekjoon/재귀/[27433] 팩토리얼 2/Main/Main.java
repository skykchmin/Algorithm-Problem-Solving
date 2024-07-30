import java.util.Scanner;

public class Main {

    static long fac = 1;
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        T.solution(N);
        System.out.println(fac);
    }

    public void DFS(int n){
        if(n==0){
            return;
        } else {
            DFS(n - 1);
            fac = fac * n;
        }
    }

    public void solution(int n) {
        DFS(n);
    }
}
