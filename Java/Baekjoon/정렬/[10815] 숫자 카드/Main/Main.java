import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String s1 = sc.nextLine();
        String[] split = s1.split(" ");

        int[] get = new int[split.length];
        for (int i = 0; i < n; i++){
            get[i] = Integer.parseInt(split[i]);
        }

        int m = sc.nextInt();
        sc.nextLine();
        String s2 = sc.nextLine();
        String[] split2 = s2.split(" ");

        int[] cards = new int[split2.length];
        for(int i = 0; i < m; i++){
            cards[i] = Integer.parseInt(split2[i]);
        }

        List<Integer> answer = T.solution(n, get, m, cards);
        for(int i : answer){
            System.out.print(i + " ");
        }
    }

    private List<Integer> solution(int n, int[] get, int m, int[] cards) {

        List<Integer> answer = new ArrayList<>();

        // 리스트 형태로 만들기
        List<Integer> getList = Arrays.stream(get)
                .boxed()
                .collect(Collectors.toList());

        // 정렬하기
        Collections.sort(getList);

        // cart 가지고 있는 만큼 반복
        for(int i = 0; i < m; i++){
            int target = cards[i]; // 찾아야할 수

            // 이진탐색
            int lt = 0;
            int rt = n - 1;
            int mid;

            boolean isFound = false;

            while (lt <= rt){
                mid = (lt + rt) / 2;

                if(getList.get(mid) == target){
                    isFound = true;
                    break;
                } else if(target < getList.get(mid)){ // 작을 경우
                    rt = mid - 1;
                } else if(target > getList.get(mid)){
                    lt = mid + 1;
                }
            }

            if(isFound){
                answer.add(1);
            } else {
                answer.add(0);
            }
        }

        return answer;
    }
}
