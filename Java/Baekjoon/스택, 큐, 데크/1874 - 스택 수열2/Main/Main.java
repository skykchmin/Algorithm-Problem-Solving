import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        boolean answer = T.solution(arr);

        if(!answer){
            System.out.println("NO");
        } else {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }

    private boolean solution(int[] arr) {
        boolean isAnswer = true;

        Stack<Integer> stack = new Stack<>();

        int num = 1;

        // 가능할 경우
        for(int i = 0; i < arr.length; i++){
            int target = arr[i];

            // 스택이 비어있을 경우
            if(stack.isEmpty()){
                while(num < target){
                    stack.push(num);
                    list.add("+");
                    num++;
                }
            }

            while(num <= target){
                stack.push(num);
                list.add("+");
                num++;
            }

            if (!stack.isEmpty() && stack.peek() == target) {
                stack.pop();
                list.add("-");
            } else {
                isAnswer = false;
                break;
            }
        }

        return isAnswer;
    }
}

