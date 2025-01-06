import java.util.*;

public class MainLecture {

    public static void main(String[] args) {
        MainLecture T = new MainLecture();

        int[] numbers = {6, 10, 2};

        String answer = T.solution(numbers);
        System.out.println(answer);
    }

    public String solution(int[] numbers){

        ArrayList<String> list = new ArrayList<>();
        for(int number : numbers){
            list.add(String.valueOf(number));
        }

//        list.sort((o1, o2) -> {
//            int a = Integer.parseInt(o1 + o2);
//            int b = Integer.parseInt(o2 + o1);
//            return Integer.compare(b, a);
//        });

        // Comparator를 명시적으로 구현
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String a = o1 + o2;
                String b = o2 + o1;
                return b.compareTo(a); // b - a 순으로 정렬
            }
        });


        StringBuilder sb = new StringBuilder();
        for(String s : list){
            sb.append(s);
        }

        return sb.charAt(0) == '0' ? "0" : sb.toString();

    }
}
