import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {


    public static void main(String[] args) {
        Main2 T = new Main2();

        Scanner sc = new Scanner(System.in);
        int n;

        do {
            String s = sc.nextLine();
            String[] strings = s.split(" ");
            n = Integer.parseInt(strings[0]);

            if (n == 0) {
                break;
            }

            ArrayList<Integer> tempList = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                tempList.add(Integer.parseInt(strings[i]));
            }

            T.solution(tempList);
            System.out.println();
        } while (n != 0);
    }

    public void solution(ArrayList<Integer> arr) {
        boolean[] visit = new boolean[50];

        dfs(0, 0, visit, arr);
    }

    private void dfs(int depth, int start, boolean[] visit, ArrayList<Integer> arr) {
        if(depth == 6){
            // 출력
            int[] selected = new int[6];

            int j = 0;
            for(int i = 0; i < visit.length; i++){
                if(visit[i]){
                    selected[j] = i;
                    j++;
                }
            }

            Arrays.sort(selected);
            for(int select : selected){
                System.out.print(select + " ");
            }

            System.out.println();
            return;
        }

        for(int i = start; i < arr.size(); i++){
            int select = arr.get(i);
            if(!visit[select]){
                visit[select] = true;
                dfs(depth + 1, i + 1, visit, arr);
                visit[select] = false;
            }
        }
    }
}
