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

        for(int a = 1 ; a < n; a++){
            for(int b = 1 ; b < n; b++){
                for(int c = 1 ; c < n; c++){
                    if(a + b + c == n){
                        if(c - b >= 2){
                            if(a % 2 != 1){
                                count++;
                            }
                        }
                    }
                }
            }
        }

        return count;
    }
}
