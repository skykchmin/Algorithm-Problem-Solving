import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);

        for(int i = 0; i < n - 2; i++){
            int temp = arr.get(i) + arr.get(i + 1);
            arr.add(temp);
        }

        return arr;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> answer = T.solution(n);
        for (Integer x : answer) {
            System.out.print(x + " ");
        }
    }
}
