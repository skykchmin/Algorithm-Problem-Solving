import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    int answer = 0;
    int[] dis = {1, -1, 5};

    int[] ch; // 한번 큐에 넣은것은 다시 넣지 않기 위해서
    Queue<Integer> Q = new LinkedList<>();

    public int BFS(int s, int e) {
        ch = new int[10001];
        ch[s] = 1; // 방문하면 1로
        Q.offer(s);

        int L = 0; // 레벨
        while (!Q.isEmpty()){
            int len = Q.size();
            for(int i = 0; i < len; i++){ // 레벨 원소의 갯수
                int x = Q.poll();

                if(x == e){ // 찾았다면
                    return L;
                }

                for(int j = 0; j < 3; j++){
                    int nx = x + dis[j];
                    if(nx >= 1 && nx <= 10000 && ch[nx] == 0){
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); // 출발점
        int e = sc.nextInt(); // 송아지 위치
        System.out.println(T.BFS(s, e));
    }


}
