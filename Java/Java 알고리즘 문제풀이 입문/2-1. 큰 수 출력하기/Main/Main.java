import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public String solution(int[] inputNums){
        HashSet<Integer> rs = new LinkedHashSet<>();

        if(inputNums.length == 1){
            return String.valueOf(inputNums[0]);
        }

        rs.add(inputNums[0]);

        for(int i = 0; i < inputNums.length - 1; i++){
            if(inputNums[i] >= inputNums[i+1]){
                rs.add(inputNums[i]);
            } else {
                rs.add(inputNums[i+1]);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (Integer r : rs) {
            sb.append(r + " ");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int[] inputNums = new int[inputNum];
        for(int i = 0; i < inputNum; i++){
            int nextInt = sc.nextInt();
            inputNums[i] = nextInt;
        }
        sc.close();

        String answer = T.solution(inputNums);
        System.out.println(answer);
    }
}