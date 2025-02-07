import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        T.solution(n);
    }

    public void solution(int n) {

//        String[] answer = new String[n];
//
//        answer[0] = "SK";
//        answer[1] = "CY";

        if(n % 2 == 1){
            System.out.println("SK");
        } else {
            System.out.println("CY");
        }
    }
}
