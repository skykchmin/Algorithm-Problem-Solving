import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];

        for(int i = 0; i < 4; i++){
            arr[i] = sc.nextInt();
        }

        int answer = T.solution(arr);
        System.out.println(answer);

    }

    public int solution(int[] arr) {
        int answer = 1;

        List<Integer> clockNum = getClockNum(arr);
        Collections.sort(clockNum);
        int inputClockNumber = clockNum.get(0); // 가장 작은 시계수

        Set<Integer> uniqueClockNumbers = new HashSet<>();

        for(int i = 1111; i <= 9999; i++){
            // 0 포함 X
            if(String.valueOf(i).contains("0")){
                continue;
            }

            int[] temp = new int[4];
            for(int j = 0; j < 4; j++){
                String[] strings = String.valueOf(i).split("");
                temp[j] = Integer.parseInt(strings[j]);
            }

            List<Integer> clockNum2 = getClockNum(temp);
            Collections.sort(clockNum2);
            int tempMin = clockNum2.get(0);
            uniqueClockNumbers.add(tempMin);
        }

        List<Integer> sortedClockNumbers = new ArrayList<>(uniqueClockNumbers);
        Collections.sort(sortedClockNumbers);

        answer = sortedClockNumbers.indexOf(inputClockNumber) + 1;

        return answer;
    }

    private List<Integer> getClockNum(int[] arr) {
        List<Integer> clockNum = new ArrayList<>();

        for(int i = 0; i < 4; i++){ // 4번
            StringBuilder sb = new StringBuilder();

            for(int j = 0; j < 4; j++){ // 4자리수

                int temp = (i + j) % 4;
                sb.append(arr[temp]);
            }

            clockNum.add(Integer.parseInt(sb.toString()));
        }
        return clockNum;
    }


}
