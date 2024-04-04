import java.util.Scanner;

public class Main {

    public String solution(String inputStr){
        char[] charArray = inputStr.toCharArray();

        for (int i = 0; i < inputStr.length() / 2; i++){
            char temp = '\u0000';

            if((charArray[i] >= 65 && charArray[i] <= 90) || (charArray[i] >= 97 && charArray[i] <= 122) ){
                temp = charArray[charArray.length - i - 1];
                charArray[charArray.length - i - 1] = charArray[i];
                charArray[i] = temp;
            } else {
                charArray[i] = charArray[i];
            }
        }

        return String.valueOf(charArray);
    }

    public String solutionLecture(String str){
        String answer;
        char[] s = toString().toCharArray();
        int lt = 0, rt= str.length()-1;
        while (lt<rt){
            if(!Character.isAlphabetic(s[lt])){
                lt++;
            } else if (!Character.isAlphabetic(s[rt])){
                rt--;
            } else {
                char tmp=s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        sc.close();

        System.out.println(T.solution(inputStr));
    }
}
