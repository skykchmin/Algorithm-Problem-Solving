import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String answer = T.solution(s);
        System.out.println(answer);
    }

    private String solution(String s) {
        int[] arr = new int[26];

        char[] charArray = s.toCharArray();
        for(char c : charArray){
            arr[c - 'a'] += 1;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 26; i++){
            for(int j = 0; j < arr[i]; j++){
                sb.append((char)(i + 'a'));
            }
        }

        return sb.toString();
    }
}
