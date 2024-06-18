import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        T.DFS(3);
    }

    private void DFS(int n) {
        if(n==0){
            return;
        } else {
            DFS(n - 1);
            System.out.print(n);
        }
    }

}
