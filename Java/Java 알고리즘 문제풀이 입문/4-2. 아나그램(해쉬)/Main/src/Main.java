import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        sc.close();

        String answer = T.solution(a, b);
        System.out.println(answer);
    }

    public String solution(String a, String b) {

        String answer = "NO";

        TreeMap<Character, Integer> mapA = new TreeMap<>();
        TreeMap<Character, Integer> mapB = new TreeMap<>();

        for(char x1 : a.toCharArray()){
            mapA.put(x1, mapA.getOrDefault(x1, 0) + 1);
        }

        for(char x2 : b.toCharArray()){
            mapB.put(x2, mapB.getOrDefault(x2, 0) + 1);
        }

        boolean equals = mapA.equals(mapB);

        if(equals){
            answer = "YES";
        }

        return answer;
    }
}
