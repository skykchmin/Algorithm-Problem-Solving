import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<ArrayList<Integer>> arrays;
    static ArrayList<Integer> answer;
    
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        arrays = new ArrayList<>();
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

            arrays.add(tempList);

        } while (n != 0);

        T.solution();
    }

    private void solution() {
        for(int i = 0; i < arrays.size(); i++){
            answer = new ArrayList<>();
            calc(i);
            System.out.println();
        }


    }

    private void calc(int index) {
        ArrayList<Integer> list = arrays.get(index);

        // dfs
        dfs(list, 0, 0);
    }

    private void dfs(ArrayList<Integer> list, int start, int count) {
        //
        if(count == 6){
            for (int num : answer) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i < list.size(); i++) {
            answer.add(list.get(i));
            dfs(list, i + 1, count + 1);
            answer.remove(answer.size() - 1);
        }
    }


}
