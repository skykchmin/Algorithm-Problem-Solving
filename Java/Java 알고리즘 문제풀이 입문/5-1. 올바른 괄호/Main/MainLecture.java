import java.util.Scanner;
import java.util.Stack;

public class MainLecture {

    public String solution(String str) {
        String answer = "YES";

        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x == '('){
                stack.push(x);
            } else {
                if(stack.isEmpty()){
                    return "NO";
                }

                stack.pop();
            }
        }

        if(!stack.isEmpty()){
            return "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        MainLecture T = new MainLecture();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String answer = T.solution(str);

        System.out.println(answer);
    }


}
