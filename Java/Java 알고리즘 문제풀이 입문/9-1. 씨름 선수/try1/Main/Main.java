import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    static class Person implements Comparable<Person>{
        int height;

        int weight;

        public Person(int height, int weight){
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Person o) {
            return o.height - this.height;
        }
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        List<Person> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            String[] strings = s.split(" ");
            list.add(new Person(Integer.parseInt(strings[0]), Integer.parseInt(strings[1])));
        }

        int answer = T.solution(list);
        System.out.println(answer);
    }

    public int solution(List<Person> list) {

        Collections.sort(list);

        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).weight > max ){
                count++;
                max = list.get(i).weight;
            }
        }

        return count;
    }
}
