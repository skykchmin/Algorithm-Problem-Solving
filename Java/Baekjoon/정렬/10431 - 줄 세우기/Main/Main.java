import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= P; i++){
            String[] strings = sc.nextLine().split(" ");

            int[] arr = new int[20];
            for(int j = 1; j < strings.length; j++) {
                arr[j - 1] = Integer.parseInt(strings[j]);
            }

            int step = T.solution(arr);

            System.out.println(i + " " + step);
        }
    }

    public int solution(int[] heights) {
        List<Integer> line = new ArrayList<>(); // 정렬된 줄
        int steps = 0;

        for (int height : heights) {
            int pos = 0;
            while (pos < line.size() && line.get(pos) < height) {
                pos++;
            }

            line.add(pos, height);
            steps += (line.size() - 1 - pos);
        }

        return steps;
    }
}
