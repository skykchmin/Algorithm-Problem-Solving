import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;
    public void DFS(int v){
        if(v == n){
            answer++;
        } else {
            // v번 ArrayList
            for(int nv : graph.get(v)){
                if(ch[nv] == 0){
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();

        // 1번 부터 N번까지 리스트를 저잘할 수 있는 리스트 생성
        for(int i = 0; i <=n; i++){
            graph.add(new ArrayList<Integer>());
        }

        // 체크 배열
        ch = new int[n+1];

        for(int i = 0; i< m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }

        ch[1] = 1;
        T.DFS(1);
    }
}
