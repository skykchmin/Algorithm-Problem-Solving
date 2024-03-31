import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public String solution2(String inputStr){
        char[] chars = new char[inputStr.length()]; // 크기 조정

        for(int i = 0; i < inputStr.length(); i++){
            char s = inputStr.charAt(i); // 각 문자열의 문자를 가져옴

            if(Character.isUpperCase(s)){
                chars[i] = Character.toLowerCase(s); // 대문자이면 소문자로 변환하여 배열에 저장
            } else {
                chars[i] = Character.toUpperCase(s); // 소문자이면 대문자로 변환하여 배열에 저장
            }
        }

        String result = String.valueOf(chars);

        return result;
    }

    public String solution3(String inputStr){
        String answer = "";
        for(char x : inputStr.toCharArray()){
            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }
        return answer;
    }

    public String solution4(String inputStr){
        String answer = "";
        for(char x : inputStr.toCharArray()){
            if(x>= 97 && x<= 122) answer +=(char)(x-32);
            else answer +=(char)(x+32);
        }
        return answer;
    }

    public String solution(String inputStr){
        StringBuilder resultBuilder = new StringBuilder();

        for(char s : inputStr.toCharArray()){
            if(Character.isUpperCase(s)){
                resultBuilder.append(Character.toLowerCase(s));
            } else {
                resultBuilder.append(Character.toUpperCase(s));
            }
        }

        return resultBuilder.toString();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        sc.close();

        String solution = T.solution(inputStr);
        System.out.println(solution);
    }
}