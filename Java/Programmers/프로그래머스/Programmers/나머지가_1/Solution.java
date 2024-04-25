package 나머지가_1;

import java.util.Scanner;

class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i = 2; i < n; i++){
            if(n % i == 1){
                answer = i;
                return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        int solution = T.solution(i);
        System.out.println(solution);
    }
}
