import java.util.Scanner;

public class Main {
    static int n;
    static String tap = "____";

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        T.solution();
    }

    private void solution() {
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        dfs(0);
    }

    private void dfs(int index) {
        // index에 따라 tap을 앞에 반복해서 추가해주는 부분
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < index; i++) {
            sb.append(tap);
        }
        String frontTap = sb.toString();  // 현재 단계의 tap

        System.out.println(frontTap + "\"재귀함수가 뭔가요?\"");

        // 종료 조건
        if (index == n) {
            System.out.println(frontTap + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
            System.out.println(frontTap + "라고 답변하였지.");
            return;
        }

        // 재귀적 출력 내용
        System.out.println(frontTap + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
        System.out.println(frontTap + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
        System.out.println(frontTap + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");

        // 재귀 호출
        dfs(index + 1);

        // 재귀 종료 후 답변
        System.out.println(frontTap + "라고 답변하였지.");
    }
}