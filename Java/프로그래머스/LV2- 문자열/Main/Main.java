import java.util.Scanner;

public class Main {
    public String solution(String s) {
        String answer = "";

        String[] strList = s.split(" ");
        String[] jadenList = new String[strList.length];
        for(int i = 0; i < strList.length; i++){
            String temp = "";

            if(strList[i].charAt(0) >= 'a' && strList[i].charAt(0) <= 'z'){
                temp = strList[i].replace(strList[i].charAt(0), Character.toUpperCase(strList[i].charAt(0)));
            } else {
                temp = strList[i];
            }

            jadenList[i] = temp;
        }

        StringBuilder sb = new StringBuilder();

        for(String x : jadenList){
            sb.append(x + " ");
        }

        answer = sb.toString().trim();

        return answer;
    }

    public String solution3(String s) {
        StringBuilder sb = new StringBuilder();

        // TODO: 1. 문자열 자체를 소문자로 바꾸기
        String lowerCase = s.toLowerCase();

        // TODO: 2. 문자열 앞의 문자를 대문자로 바꾸기
        String[] lowerList = lowerCase.split(" ");

        // TODO: 3. 반복문 돌면서 첫 글자 바꾸기
        for(int i = 0; i < lowerList.length; i++){
            String temp = "";
            if(lowerList[i].charAt(0) >= 'a' && lowerList[i].charAt(0) <= 'z'){
                temp = lowerList[i].replace(lowerList[i].charAt(0), Character.toUpperCase(lowerList[i].charAt(0)));
            } else {
                temp = lowerList[i];
            }

            sb.append(temp + " ");
        }

        return sb.toString().trim();
    }

    public String solution4(String s) {
        StringBuilder answerSb = new StringBuilder();

        String[] strList = s.split(" ");

        String[] tempList = new String[strList.length];
        for(int i = 0; i < strList.length; i++){
            StringBuilder sb = new StringBuilder();

            sb.append(strList[i].substring(0, 1).toUpperCase());
            sb.append(strList[i].substring(1, strList[i].length()).toLowerCase());

            tempList[i] = sb.toString();
        }

        for(String x : tempList){
            answerSb.append(x + " ");
        }

        String temp = answerSb.toString();
        String answer = temp.substring(0, temp.length() - 1);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String answer = T.solution3(s);
        System.out.println(answer);
    }
}
