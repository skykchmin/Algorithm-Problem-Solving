import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        String answer = T.solution(a, b);
        System.out.println(answer);
    }

    public String solution(String a, String b) {

        String answer = "YES";

        LinkedList<Character> queueA = new LinkedList<>();
        LinkedList<Character> queueB = new LinkedList<>();

        // 초기 세팅
        for(Character x: a.toCharArray()){
            queueA.offer(x);
        }

        for (Character y: b.toCharArray()){
            queueB.offer(y);
        }

        for(int i = 0; i < b.length(); i++){
            if(queueA.isEmpty()){
                return answer;
            }

            if(queueA.contains(queueB.peek())){
                if(!(queueA.peek() == queueB.peek())){
                    answer = "NO";
                    return answer;
                } else {
                    queueA.remove();
                    queueB.remove();
                }
            } else {
                queueB.remove();
            }
        }

        // 필수과목을 안들었을 경우
        if(!queueA.isEmpty()){
            return answer = "NO";
        }

        return answer;
    }
}
