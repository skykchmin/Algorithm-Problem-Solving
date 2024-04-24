package 내림차순_정렬하기;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;

        String s = String.valueOf(n);
        char[] charArray = s.toCharArray();
        ArrayList<Integer> integers = new ArrayList<>();
        for(int i = 0; i < charArray.length; i++){
            integers.add(Integer.parseInt(String.valueOf(charArray[i])));
        }

        Collections.sort(integers, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();

        for (Integer integer : integers) {
            sb.append(integer);
        }

        String str = sb.toString();

        answer = Long.parseLong(str);
        return answer;
    }
}
