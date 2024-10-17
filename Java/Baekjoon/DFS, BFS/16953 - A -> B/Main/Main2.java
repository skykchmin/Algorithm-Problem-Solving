import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main2 {

    public class Node{
        long value;

        long count;

        public Node(long value, long index){
            this.value = value;
            this.count = index;
        }
    }

    public static void main(String[] args) {
        Main2 T = new Main2();

        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextInt();

        long answer = T.solution(a, b);

        System.out.println(answer);
    }

    private long solution(long a, long b) {

        Deque<Node> deque = new ArrayDeque<>();

        deque.addLast(new Node(a, 1));

        while(!deque.isEmpty()){

            Node now = deque.pollFirst();

            if(now.value == b){
                return now.count;
            }


            if(now.value > b){
                continue;
            }

            deque.addLast(new Node(2 * now.value, now.count + 1));
            deque.addLast(new Node(10 * now.value + 1, now.count + 1));

        }

        return -1;
    }
}
