import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int answer = T.solution(n);
        System.out.println(answer);
    }

    private int solution(int n) {

        int i = 0;
        for(i = 0; i < n; i++){
            if(Math.pow(i, 2) == n){
                break;
            } else if(Math.pow(i, 2) > n){
                i--;
                break;
            }

        }

        return i;
    }
}
