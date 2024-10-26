import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 시간초과
 */
public class Main {
    
    static long[] arrN;
    static long[] arrM;

    static int N, M;
    
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        sc.nextLine();

        arrN = new long[N];
        String s = sc.nextLine();
        String[] stringN = s.split(" ");
        for(int i = 0; i < N; i++){
            arrN[i] = Long.parseLong(stringN[i]);
        }

        M = sc.nextInt();
        sc.nextLine();

        arrM = new long[M];
        String s2 = sc.nextLine();
        String[] stringM = s2.split(" ");
        for(int i = 0; i < M; i++){
            arrM[i] = Long.parseLong(stringM[i]);
        }
        
        T.solution();
    }

    private void solution() {

        // 정렬
        Arrays.sort(arrN);

        for(int i = 0; i < arrM.length; i++){
            int count = binarySearch(arrM[i]);
            System.out.print(count+ " ");
        }
    }

    public int binarySearch(long target){
        int count = 0;

        int lt = 0;
        int rt = N - 1;

        // 방문했다면 + 1

        while(lt <= rt){
            int mid = (lt + rt) / 2;

            if(target == arrN[mid]){
                count++;
                int front = mid - 1;
                int back = mid + 1;

                while (front >= 0 && target == arrN[front] ){
                    count++;
                    front--;
                }

                while (back < N && target == arrN[back] ){
                    count++;
                    back++;
                }

                break;
            } else if(target < arrN[mid]){
                rt = mid - 1;
            } else if(target > arrN[mid]){
                lt = mid + 1;
            }
        }

        return count;
    }
}
