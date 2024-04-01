import java.util.Scanner;

public class Main {
    public String solution(String inputStr){
        String[] strList = inputStr.split(" ");
        int max = 0;
        String answer = "";

        for(String x : strList){
            int len = x.length();
            if(len > max){
                max = len;
                answer = x;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        sc.close();

        System.out.println(T.solution(input));
    }
}
