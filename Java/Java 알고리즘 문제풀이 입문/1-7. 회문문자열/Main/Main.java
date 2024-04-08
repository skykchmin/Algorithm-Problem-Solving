import java.util.Scanner;

public class Main {
    public String solutionLecture(String str){
        String answer = "YES";
        str = str.toLowerCase();
        int len = str.length();
        for(int i = 0; i < len/2; i++){
            if(str.charAt(i) != str.charAt(len-i-1)) return  "NO";
        }
        return answer;
    }

    public String solutionLecture2(String str){
        String answer = "NO";

        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        sc.close();

        String answer = T.solutionLecture(inputStr);
        System.out.println(answer);
    }
}
