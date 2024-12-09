import java.util.Scanner;

public class try2 {
    public static void main(String[] args) {
        try2 T = new try2();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        sc.nextLine();

        int[] nums = new int[n];
        String s = sc.nextLine();
        String[] strings = s.split(" ");

        for(int i = 0; i < n; i++){
            nums[i] = Integer.parseInt(strings[i]);
        }

        int answer = T.solution(n, m, nums);
        System.out.println(answer);
    }

    public int solution(int n, int m, int[] nums) {
        int count = 0;

        int lt = 0;
        int rt = 0;

        int sum = 0;
        for(int i = rt; i < n; i++){
            sum += nums[i];

            while(sum > m){
                sum -= nums[lt];
                lt++;
            }

            if(sum == m){
                count++;
            }
        }

        return count;
    }
}
