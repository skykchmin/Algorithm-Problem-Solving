public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        T.DFS(5);
    }

    public int DFS(int n) {
        if(n==1){
            return 1;
        } else {
            return n * DFS(n-1);
        }
    }
}
