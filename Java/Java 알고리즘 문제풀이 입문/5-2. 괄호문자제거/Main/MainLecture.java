import java.util.Scanner;
import java.util.Stack;

public class MainLecture {
    public static void main(String[] args) {
        MainLecture T = new MainLecture();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String answer = T.solution(str);

        System.out.println(answer);
    }

    public String solution(String str) {
        String answer = "";

        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if( x == ')'){
                while(stack.pop()!= '(');
            } else {
                stack.push(x);
            }
        }

        for (int i = 0; i < stack.size(); i++){
            answer += stack.get(i);
        }

        return answer;
    }
}
