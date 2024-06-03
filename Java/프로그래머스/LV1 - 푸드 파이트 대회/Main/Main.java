import java.util.*;

class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] food = new int[num];
        for(int i = 0; i < num; i++){
            food[i] = sc.nextInt();
        }

        String answer = T.solution(food);
        System.out.println(answer);
    }

    public String solution(int[] food) {
        String answer = "";
        Deque<Integer> deque = new ArrayDeque<>();

        // 물 집어 넣기
        for(int a = 0; a < food[0]; a++){
            deque.offerFirst(0);
        }


        int rank = food.length - 1;
        for(int i = food.length - 1; 1 <= i; i--){
            int temp = food[i] / 2;
            for(int j = 0; j < temp; j++){
                deque.offerFirst(rank);
                deque.offerLast(rank);
            }

            rank--;
        }

        for(int x : deque){
            answer += x;
        }

        return answer;
    }

    public String solution2(int[] food) {
        StringBuilder answer = new StringBuilder();
        List<Integer> list = new ArrayList<>();

        // 물 집어 넣기
        for(int a = 0; a < food[0]; a++){
            list.add(0);
        }

        int rank = food.length - 1;
        for(int i = food.length - 1; i >= 1; i--){
            int temp = food[i] / 2;
            for(int j = 0; j < temp; j++){
                list.add(0, rank);
                list.add(rank);
            }
            rank--;
        }

        for (int x : list) {
            answer.append(x);
        }

        return answer.toString();
    }
}
