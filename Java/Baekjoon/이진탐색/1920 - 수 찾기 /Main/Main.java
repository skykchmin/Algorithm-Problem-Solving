import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    static long[] arrN;
    static long[] arrM;

    static int n, m;

    public static void main(String[] args) {
        MainLecture T = new MainLecture();

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        sc.nextLine();

        arrN = new long[n+1];
        String s = sc.nextLine();
        String[] strings = s.split(" ");
        for(int i = 0; i < n; i++){
            arrN[i + 1] = Long.valueOf(strings[i]);
        }

        m = sc.nextInt();
        sc.nextLine();
        arrM = new long[m+1];
        String s2 = sc.nextLine();
        String[] strings2 = s2.split(" ");
        for(int i = 0; i < m; i++){
            arrM[i + 1] = Long.valueOf(strings2[i]);
        }

        T.solution();
    }

    private void solution() {
        // List로 변경
        List<Long> arrNList = Arrays.stream(arrN)
                .boxed()
                .collect(Collectors.toList());

        List<Long> arrMList = Arrays.stream(arrM)
                .boxed()
                .collect(Collectors.toList());

        Collections.sort(arrNList);

        for(int i = 1; i <= m; i++){
            int answer = 0;

            int lt = 0;
            int rt = arrNList.size() - 1;

            while(lt <= rt){
                int mid = (lt + rt) / 2;

                if(arrMList.get(i).equals(arrNList.get(mid))){
                    answer = 1;
                    break;
                } else if(arrMList.get(i) > arrNList.get(mid)){
                    lt = mid + 1;
                } else {
                    rt = mid - 1;
                }
            }

            System.out.println(answer);
        }
    }
}
