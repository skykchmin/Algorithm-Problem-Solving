import java.util.HashMap;

public class MainLecture {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        // Put in Map
        HashMap<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        HashMap<String, Integer> discountMap = new HashMap<>();

        // Initialize the first window
        for (int i = 0; i < 10; i++) {
            discountMap.put(discount[i], discountMap.getOrDefault(discount[i], 0) + 1);
        }

        // Check the first window
        if (isValidWindow(wantMap, discountMap)) {
            answer++;
        }

        // Sliding window
        for (int i = 10; i < discount.length; i++) {
            // Remove the product that is sliding out of the window
            String productOut = discount[i - 10];
            discountMap.put(productOut, discountMap.get(productOut) - 1);
            if (discountMap.get(productOut) == 0) {
                discountMap.remove(productOut);
            }

            // Add the new product that is sliding into the window
            String productIn = discount[i];
            discountMap.put(productIn, discountMap.getOrDefault(productIn, 0) + 1);

            // Check the new window
            if (isValidWindow(wantMap, discountMap)) {
                answer++;
            }
        }

        return answer;
    }

    private boolean isValidWindow(HashMap<String, Integer> wantMap, HashMap<String, Integer> discountMap) {
        for (String key : wantMap.keySet()) {
            if (discountMap.getOrDefault(key, 0) < wantMap.get(key)) {
                return false;
            }
        }
        return true;
    }
}
