import java.util.Scanner;

public class Main {
    public String solutionLecture(String inputStr){
        String answer = "";
        for(int i = 0; i < inputStr.length(); i++){
//            System.out.println(inputStr.charAt(i) + " " +inputStr.indexOf(inputStr.charAt(i)));
            if(inputStr.indexOf(inputStr.charAt(i)) == i) answer += inputStr.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();

        sc.close();
        String solution = T.solutionLecture(inputStr);
        System.out.println(solution);
    }
}
