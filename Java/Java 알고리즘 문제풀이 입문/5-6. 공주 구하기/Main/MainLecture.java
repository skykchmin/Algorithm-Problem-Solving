import java.util.LinkedList;
import java.util.Scanner;

public class MainLecture {
    public static void main(String[] args) {
        MainLecture T = new MainLecture();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int answer = T.solution(n, k);
        System.out.println(answer);
    }

    public int solution(int n, int k) {
        int answer = 0;

        LinkedList<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            queue.offer(i);
        }

        while (!queue.isEmpty()){
            for(int i = 1; i < k; i++){
                queue.offer(queue.poll());
            }

            queue.poll();
            if(queue.size() == 1){
                answer = queue.poll();
            }
        }

        return answer;
    }
}
