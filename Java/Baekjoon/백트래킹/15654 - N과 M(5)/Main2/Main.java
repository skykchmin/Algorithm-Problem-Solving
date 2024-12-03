import java.util.*;

public class Main {

    static int n;
    static int m;

    static boolean[] visit;

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        sc.nextLine();

        String s = sc.nextLine();
        String[] strings = s.split(" ");
        int[] num = new int[strings.length];

        for(int i = 0; i < num.length; i++){
            num[i] = Integer.parseInt(strings[i]);
        }

        Arrays.sort(num);

        visit = new boolean[strings.length];

        T.solution(num);
    }

    private void solution(int[] num) {
        int[] arr = new int[m + 1];

        dfs(0, num, arr);
    }

    private void dfs(int depth, int[] num, int[] arr) {
        if(depth == m){
            for(int i = 1; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < num.length; i++){
            if(visit[i] == true){
                continue;
            }

            arr[depth + 1] = num[i];
            visit[i] = true;
            dfs(depth + 1, num, arr);
            visit[i] = false;
        }

    }
}

