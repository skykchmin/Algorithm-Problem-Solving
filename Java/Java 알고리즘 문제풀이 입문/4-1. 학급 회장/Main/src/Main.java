import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        String answer = T.solution(n, s);
        System.out.println(answer);
    }

    public String solution(int n, String str) {
        String[] strings = str.split("");

        HashMap<String, Integer> dic = new HashMap<>();
        
        for(String s : strings){
            int x = 1;

            if(dic.containsKey(s)){
                x = dic.get(s) + 1;
            }

            dic.put(s, x);
        }

        Integer max = Collections.max(dic.values());

        String answer = null;

        for (String s : dic.keySet()) {
            if((dic.get(s)).equals(max)){
                answer = s;
                break;
            }
        }

        return answer;
    }
}
