import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length - 1; i++){
            for(int j = i+1; j < numbers.length; j++){
                int temp = numbers[i] + numbers[j];
                set.add(temp);
            }
        }

        return set.stream().sorted()
                .mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
    }
}
