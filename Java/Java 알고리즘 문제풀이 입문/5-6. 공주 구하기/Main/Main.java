import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int answer = T.solution2(n, k);
        System.out.println(answer);
    }

    public int solution2(int n, int k) {
        LinkedList<Integer> queue = new LinkedList<>();

        // 초기 세팅
        for(int i = 1; i <= n; i++){
            queue.add(i);
        }

        int count = 1;
        while(queue.size() != 1){
            if(count == k){
                queue.remove();
                count = 1;
            } else {
                queue.add(queue.poll());
                count++;
            }
        }

        Integer answer = queue.poll();
        return answer;

    }
}
