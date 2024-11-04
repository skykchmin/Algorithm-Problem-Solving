import java.util.HashSet;
import java.util.Scanner;
import java.util.*;

public class try1 {
    public static void main(String[] args) {
        try1 try1 = new try1();

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int n = sc.nextInt();
            sc.nextLine();

            Set<String> set = new HashSet<>();

            for(int j = 0; j < n; j++){
                String s = sc.nextLine();
                String[] strings = s.split(" ");
                set.add(strings[1]); // 종류 하나씩 넣기
            }

            int answer = try1.solution(n, set);
            System.out.println(answer);
        }

        sc.close();

    }

    private int solution(int n, Set<String> cloth) {
        int answer = n; // 1가지씩 입을 때 갯수만큼 초기화

        int count = 0;
        // 2개 이상일 경우 모든 경우의 수 구하기
        int size = cloth.size();

        if(size >= 2){
            count = fact(size);
        }


        answer += count;

        return answer;
    }

    private int fact(int n){
        if(n <= 1){
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}
