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

    public String solutionLecture(String inputStr){
        String answer = "";
        int max = Integer.MIN_VALUE;
        String[] s = inputStr.split(" ");
        for (String x : s) {
            int len = x.length();
            if(len > max){
                max = len;
                answer = x;
            }
        }

        return answer;
    }

    public String solutionLecture2(String inputStr){
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        while ((pos = inputStr.indexOf(" ")) != -1){
            String tmp = inputStr.substring(0, pos);
            int len = tmp.length();
            if(len > m){
                m = len;
                answer = tmp;
            }
            inputStr = inputStr.substring(pos + 1);
        }
        if(inputStr.length() > m) answer = inputStr;

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
