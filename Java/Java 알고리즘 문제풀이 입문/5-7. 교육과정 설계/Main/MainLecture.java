import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MainLecture {

    public static void main(String[] args) {
        MainLecture T = new MainLecture();
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        String answer = T.solution(a, b);
        System.out.println(answer);
    }

    private String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();

        for(char x : need.toCharArray()){
            queue.offer(x);
        }

        for(char y: plan.toCharArray()){
            if(queue.contains(y)){
                if(y != queue.poll()){
                    return "NO";
                }
            }
        }

        // 이수를 안했는지 확인
        if(!queue.isEmpty()){
            return "NO";
        }


        return answer;
    }
}
