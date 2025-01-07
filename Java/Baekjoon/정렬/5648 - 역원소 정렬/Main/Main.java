import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long[] arr = new Long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        // 해결된 로직으로 처리
        Long[] answers = T.solution(arr);
        for (Long num : answers) {
            System.out.println(num);
        }

    }

    private Long[] solution(Long[] inputs) {
        String[] arr = new String[inputs.length];
        Long[] answers = new Long[inputs.length];

        for(int i = 0; i < inputs.length; i++){
            String s = String.valueOf(inputs[i]);

            char[] chars = s.toCharArray();

            int lt = 0;
            int rt = s.length() - 1;
            while (lt <= rt){
                char temp = chars[rt];
                chars[rt] = chars[lt];
                chars[lt] = temp;

                lt++;
                rt--;
            }

            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < chars.length; j++){
                sb.append(chars[j]);
            }

            for(int k = 0; k < chars.length; k++){
                if(sb.charAt(0) == '0'){
                    sb.deleteCharAt(0);
                } else {
                    arr[i] = sb.toString();
                    break;
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            answers[i] = Long.parseLong(arr[i]);
        }

        Arrays.sort(answers);

        return answers;
    }
}
