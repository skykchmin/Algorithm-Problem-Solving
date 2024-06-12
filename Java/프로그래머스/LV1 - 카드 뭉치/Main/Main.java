import java.util.*;

public class Main {
    public String solution3(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        // 초기 세팅
        LinkedList<String> queue1 = new LinkedList<>();
        LinkedList<String> queue2 = new LinkedList<>();

        for(String card: cards1){
            queue1.offer(card);
        }

        for (String card: cards2){
            queue2.offer(card);
        }

        for(int i = 0; i < goal.length; i++){
            if(goal[i].equals(queue1.peek())){
                queue1.poll();
            } else if(goal[i].equals(queue2.peek())){
                queue2.poll();
            } else {
                answer = "No";
            }
        }

        return answer;
    }
}
