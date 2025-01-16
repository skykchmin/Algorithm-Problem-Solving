import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            T.solution(a, b, c);
        }

        for (String s : list) {
            System.out.println(s);
        }
    }

    public void solution(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        int others;

        // 가장 긴 변을 제외한 다른 두 변의 합
        if (a == max) {
            others = b + c;
        } else if (b == max) {
            others = a + c;
        } else {
            others = a + b;
        }

        if (max >= others) { // 가장 긴 변이 다른 두 변의 합보다 크거나 같으면
            list.add("Invalid");
        } else if (a == b && b == c) { // 모든 변이 같다면
            list.add("Equilateral");
        } else if (a == b || b == c || a == c) { // 두 변이 같다면
            list.add("Isosceles");
        } else { // 세 변이 모두 다르다면
            list.add("Scalene");
        }
    }
}
