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
        int count = 0;

        for(int a = 1; a <= n / 3; a++){
            for(int b = a; b <= (n - a); b++){
                int c = n - (a + b);
                if(b > c){
                    break;
                }

                if(c < a + b){
                    count++;
                }
            }
        }

        return count;
    }
}
