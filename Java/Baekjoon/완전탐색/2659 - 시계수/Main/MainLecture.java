import java.util.*;

public class MainLecture {
    public static void main(String[] args) {
        MainLecture T = new MainLecture();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int answer = T.solution(arr);
        System.out.println(answer);
    }

    public int solution(int[] arr) {
        int inputClockNumber = getClockNumber(arr);
        Set<Integer> uniqueClockNumbers = new HashSet<>();

        // Generate all possible clock numbers from digits 1 to 9
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        int[] tempDigits = {a, b, c, d};
                        int clockNumber = getClockNumber(tempDigits);
                        uniqueClockNumbers.add(clockNumber);
                    }
                }
            }
        }

        // Convert set to list and sort
        List<Integer> sortedClockNumbers = new ArrayList<>(uniqueClockNumbers);
        Collections.sort(sortedClockNumbers);

        // Find the position of the input clock number
        int position = sortedClockNumbers.indexOf(inputClockNumber) + 1;
        return position;
    }

    // Function to compute the smallest clock number from four digits
    private int getClockNumber(int[] digits) {
        int minNumber = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            int number = 0;
            for (int j = 0; j < 4; j++) {
                number = number * 10 + digits[(i + j) % 4];
            }
            if (number < minNumber) {
                minNumber = number;
            }
        }
        return minNumber;
    }
}