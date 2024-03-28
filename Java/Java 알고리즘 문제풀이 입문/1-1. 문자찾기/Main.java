import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static int solution(String input, char findStr){
        int count = 0;

        String lowerInput = input.toLowerCase();
        char lowerFindStr = Character.toLowerCase(findStr);

        for(int i = 0; i < lowerInput.length(); i++){
            if(lowerInput.charAt(i) == lowerFindStr){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char s = sc.nextLine().charAt(0);
        sc.close();

        int solution = solution(input, s);

        System.out.println(solution);
    }


}