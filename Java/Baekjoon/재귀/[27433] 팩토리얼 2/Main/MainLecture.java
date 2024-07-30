public class MainLecture {
    public static long fact(long n) {
        if (n == 0) {		// 입력이 0인경우 출력은 1
            return 1;
        }
        if (n > 1) {
            n = n * fact(n - 1); // 자기자신 호출(재귀)
        } else {
            n = n * 1; 		// n이 1이 될 때 (재귀함수 종료 조건 충족)
        }

        return n;
    }
}
