import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0; // 정답 숫자

        // 원하는 것 넣기
        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        int lt = 0;
        int rt = discount.length - 10;

        while (lt <= rt) {
            boolean isOk = true;
            Map<String, Integer> dMap = new HashMap<>();

            // 10개 루프
            for (int i = lt; i < lt + 10; i++) {
                dMap.put(discount[i], dMap.getOrDefault(discount[i], 0) + 1);
            }

            // 비교
            for (Map.Entry<String, Integer> wanted : wantMap.entrySet()) {
                int dCount = dMap.getOrDefault(wanted.getKey(), 0);
                int wantCount = wanted.getValue();

                if (dCount != wantCount) {
                    isOk = false;
                    break;
                }
            }

            if (isOk) {
                answer++;
            }

            lt++;
        }

        return answer;
    }
}