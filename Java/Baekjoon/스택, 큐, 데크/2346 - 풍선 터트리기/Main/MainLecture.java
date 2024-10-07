import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MainLecture {

    static class Balloon {
        int index;
        int value;

        Balloon(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Deque<Balloon> deque = new ArrayDeque<>();

        // 데크를 넣는다
        for (int i = 1; i <= N; i++) {
            int value = sc.nextInt();
            deque.addLast(new Balloon(i, value));
        }

        StringBuilder result = new StringBuilder();

        while (!deque.isEmpty()) {
            // 첫번째 풍선을 터트린다
            Balloon current = deque.pollFirst();
            result.append(current.index).append(" ");

            // 데크가 비어있으면 종료
            if (deque.isEmpty()) break;

            // 풍선에 따라 움직여야할 갯수
            int steps = current.value;

            if (steps > 0) {
                // 앞에서 빼서 뒤로 넣는다
                for (int i = 1; i < steps; i++) {
                    deque.addLast(deque.pollFirst());
                }
            } else {
                // 뒤에서 빼서 앞으로 넣는다
                for (int i = 0; i < Math.abs(steps); i++) {
                    deque.addFirst(deque.pollLast());
                }
            }
        }

        System.out.println(result.toString().trim());

    }
}
