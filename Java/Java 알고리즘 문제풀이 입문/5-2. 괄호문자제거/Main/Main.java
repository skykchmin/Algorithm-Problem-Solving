import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String answer = T.solution(str);

        System.out.println(answer);
    }

    public String solution(String str) {
        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()){
            if(x == '('){
                stack.push(x);
                continue;
            } else if (x == ')') {
                stack.pop();
                continue;
            }

            if(stack.isEmpty()){
                sb.append(x);
            }
        }

        return sb.toString();
    }
}
