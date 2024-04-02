import java.util.Scanner;

public class Main {

    public String[] solution(String[] inputList){
        String[] result = new String[inputList.length];

        for (int a = 0; a < inputList.length; a++) {
            StringBuilder stringBuilder = new StringBuilder();

            String s = inputList[a];
            for(int i = s.length() - 1; i >= 0; i--){
                stringBuilder = stringBuilder.append(s.charAt(i));
            }

            result[a] = stringBuilder.toString();
        }

        return result;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int inputNum = Integer.parseInt(sc.nextLine());

        String[] inputList = new String[inputNum];
        for(int i = 0; i < inputNum; i++){
            String s = sc.nextLine();
            inputList[i] = s;
        }

        String[] result = T.solution(inputList);

        for (String s : result) {
            System.out.println(s);
        }
    }
}
