import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String answer = T.solution(str);

        System.out.println(answer);
    }

    public String solution(String str) {
        String answer = "YES";

        String[] list = str.split("");
        List<String> temp = new ArrayList<>();

        for (String s : list) {
            if(s.equals("(")){
                temp.add(s);
            } else {
                if(temp.isEmpty()){
                    answer = "NO";
                    break;
                }

                temp.remove(temp.size() - 1);
            }
        }

        if(!temp.isEmpty()){
            answer = "NO";
        }

        return answer;
    }
}
