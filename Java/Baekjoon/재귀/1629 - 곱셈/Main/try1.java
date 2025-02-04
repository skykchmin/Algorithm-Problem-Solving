import java.util.Scanner;

public class try1 {
    static int A, B, C;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        int result = 1;
        for (int i = 0; i < B; i++) {
            result = (result * A) % C;
        }
        System.out.println(result);
    }
}