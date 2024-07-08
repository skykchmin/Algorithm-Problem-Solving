import java.util.Scanner;

public class MainLecture {
    static int[] dy;

    public int solution(int n) {

        // 명시적 초기화
        dy[1] = 1;
        dy[2] = 2;

        for(int i = 3; i <= n; i++){
            dy[i] = dy[i-2] + dy[i-1];
        }

        return dy[n];
    }


    public static void main(String[] args) {
        MainLecture T = new MainLecture();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        dy = new int[n + 1];
        System.out.println(T.solution(n));
    }

}
