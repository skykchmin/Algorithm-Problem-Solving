import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        //중복값을 받지 않기위해 HashSet을 사용함.
        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int i=0; i < cnt; i++){
            hashSet.add(sc.nextInt());  //입력 시 자동으로 중복값을 제거해줌.
        }

        // HashSet을 List로 변환
        List<Integer> sortedList = new ArrayList<>(hashSet);

        // 정렬
        Collections.sort(sortedList);

        StringBuilder sb = new StringBuilder();
        for(int i : sortedList){
            sb.append(i).append(" ");
        }

        System.out.println(sb.toString());
    }
}