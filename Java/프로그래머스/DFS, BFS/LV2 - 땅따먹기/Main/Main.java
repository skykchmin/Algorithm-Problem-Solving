import java.math.*;

class Solution {

    static int rowLen; // 가로
    static int colLen; // 세로

    static boolean[] rowArr; // 행
    static boolean[] colArr;

    static int max = Integer.MIN_VALUE;
    static int[][] lands;

    public static void main(String[] args) {
        Solution T = new Solution();

        int[][] array = {
                {1, 2, 3, 5},
                {5, 6, 7, 8},
                {4, 3, 2, 1}
        };

        T.solution(array);
        System.out.println(max);
    }

    int solution(int[][] land) {
        lands = land;

        rowLen = land[0].length; // 가로
        colLen = land.length; // 세로

        rowArr = new boolean[rowLen];
        colArr = new boolean[colLen];

        dfs(0, 0, 0);

        return max;
    }

    public void dfs(int row, int col, int sum) {
        if (col == colLen - 1) {
            max = Math.max(sum, max);
            return;
        }

        for (int i = 0; i < rowLen; i++) {

            if (colArr[col] == false) { // 방문하지 않았다면
                rowArr[i] = true;
                colArr[col] = true;

                // 합계
                sum += lands[col][row];

                // dfs
                dfs(i, col + 1, sum);

                rowArr[i] = false;
                colArr[i] = false;
            }
        }
    }
}