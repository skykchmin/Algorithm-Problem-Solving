import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int max = Integer.MIN_VALUE;
    static List<Integer> maxList = new ArrayList<>();

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        T.solution(num);
        System.out.println(max);

        for(int i : maxList){
            System.out.print(i + " ");
        }
    }

    private void solution(int num) {
        List<Integer> list = new ArrayList<>();

        int index = 2;
        for(int i = 1; i <= num; i++){
            // 1, 2 수 넣기
            if(list.isEmpty()){
                list.add(num);
                list.add(i);
            }

            int sum = list.get(index - 2) - list.get(index - 1);

            while (sum >= 0){
                list.add(sum);
                index++;

                sum = list.get(index - 2) - list.get(index - 1);
            }

            // 합이 작다면
            if (list.size() > max) {
                max = list.size();
                maxList = list;
            }

            list = new ArrayList<>();
            index = 2;
        }
    }
}
