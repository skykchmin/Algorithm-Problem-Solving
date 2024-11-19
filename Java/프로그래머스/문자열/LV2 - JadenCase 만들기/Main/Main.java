import java.util.*;

class Solution {
    public String solution(String s) {

        String lower = s.toLowerCase();

        StringBuilder sb = new StringBuilder();

        String[] splitS = lower.split(" ");
        for(int i = 0; i < splitS.length; i++){
            if(splitS[i].length() == 0){
                sb.append(" ");
            } else {
                sb.append(splitS[i].substring(0, 1).toUpperCase());
                sb.append(splitS[i].substring(1) + " ");
            }
        }

        // 추가한 if문
        String answer = sb.toString();
        if(s.substring(s.length()-1, s.length()).equals(" "))
            return answer;

        return answer = answer.substring(0, answer.length()-1);
    }
}