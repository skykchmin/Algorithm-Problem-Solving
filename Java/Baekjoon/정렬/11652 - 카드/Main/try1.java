import java.util.*;

public class try1 {
    public static void main(String[] args) {
        try1 T = new try1();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] arr = new long[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLong();
        }

        Long answer = T.solution(arr);
        System.out.println(answer);
    }

    private Long solution(long[] arr) {

        Map<Long, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        long num = 0;

        for(Long key : map.keySet()){
            if(map.get(key) > max){
                max = map.get(key);
                num = key;
            } else if(map.get(key) == max){
                num = Math.min(num, key);
            }
        }

        return num;
    }
}
