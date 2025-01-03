import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    static class Guitar implements Comparable<Guitar>{

        int length;

        int sum;

        String s;

        public Guitar(int length, int sum, String s){
            this.length = length;
            this.sum = sum;
            this.s = s;
        }


        @Override
        public int compareTo(Guitar o) {
            if(this.length == o.length){
                if(this.sum == o.sum){
                    // 사전순
                    return this.s.compareTo(o.s);
                } else {
                    return this.sum - o.sum ;
                }
            } else {
                return this.length - o.length;
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        
        String[] strings = new String[n];
        
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            strings[i] = s;
        }

        List<Guitar> guitarList = T.solution(strings);
        for(Guitar g : guitarList){
            System.out.println(g.s);
        }

    }

    private List<Guitar> solution(String[] strings) {

        List<Guitar> guitarList = new ArrayList<>();

        for(String s : strings){
            int length = s.length();

            int sum = 0;
            for(char c : s.toCharArray()){
                if(Character.isDigit(c)){
                    sum += (int) c - '0'; // 알파벳
                }
            }

            Guitar guitar = new Guitar(length, sum, s);
            guitarList.add(guitar);
        }

        Collections.sort(guitarList);

        return guitarList;
    }
}
