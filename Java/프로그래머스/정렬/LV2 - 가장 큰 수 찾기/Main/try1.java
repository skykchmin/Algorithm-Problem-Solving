import java.util.*;

class try1 {

    static int len;

    static List<String> list = new ArrayList<>();

    static boolean[] visit;

    public static void main(String[] args) {
        try1 T = new try1();

        int[] numbers = {6, 10, 2};

        T.solution(numbers);
    }

    public String solution(int[] numbers) {
        len = numbers.length;

        visit = new boolean[numbers.length];

        StringBuilder sb = new StringBuilder();
        dfs(0, sb, numbers);

        Collections.sort(list, Collections.reverseOrder());
        String answer = list.get(0);

        System.out.println(answer);

        return answer;
    }

    public void dfs(int depth, StringBuilder sb, int[] numbers){
        if(depth == len){
            list.add(sb.toString());

            return;
        }

        for(int i = 0; i < len; i++){
            if(visit[i]){
                continue;
            }

            sb.append(numbers[i]);
            visit[i] = true;

            dfs(depth + 1, sb, numbers);
            sb.delete(sb.length() - String.valueOf(numbers[i]).length(), sb.length());
            visit[i] = false;
        }
    }
}