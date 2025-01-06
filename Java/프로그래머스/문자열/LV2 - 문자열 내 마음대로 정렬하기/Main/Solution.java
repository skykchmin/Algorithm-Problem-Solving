import java.util.*;

public class Solution {

    class Str implements Comparable<Str>{
        String s;
        char c;

        public Str(String s, char c){
            this.s = s;
            this.c = c;
        }

        @Override
        public int compareTo(Str o) {
            if (this.c == o.c) {
                return this.s.compareTo(o.s);
            } else {
                return Character.compare(this.c, o.c);
            }
        }
    }

    public String[] solution(String[] strings, int n) {
        Str[] temp = new Str[strings.length];

        char[] arr = new char[strings.length];
        for(int i = 0 ; i < strings.length; i++){
            char c = strings[i].charAt(n);

            temp[i] = new Str(strings[i], c);
        }

        Arrays.sort(temp);

        String[] answer = new String[strings.length];
        for (int i = 0; i < temp.length; i++) {
            answer[i] = temp[i].s;
        }

        return answer;
    }
}