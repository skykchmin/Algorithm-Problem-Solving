import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    static class Person implements Comparable<Person>{
        String name;

        int kor;

        int eng;

        int math;

        public Person(String name, int kor, int eng, int math){
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }

        @Override
        public int compareTo(Person o){
            if(this.kor == o.kor){
                if(this.eng == o.eng){ // 사전 순(증가하는 순서)
                    if(this.math == o.math){
                        return this.name.compareTo(o.name);
                    } else {
                        return o.math - this.math;
                    }
                } else { // 영어점수 증가하는 순서
                    return this.eng - o.eng;
                }
            } else { // 감소하는 순서
                return o.kor - this.kor;
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine();

        List<Person> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String[] strings = sc.nextLine().split(" ");
            String name = strings[0];
            int kor = Integer.parseInt(strings[1]);
            int eng = Integer.parseInt(strings[2]);
            int math = Integer.parseInt(strings[3]);

            list.add(new Person(name, kor, eng, math));
        }

        Collections.sort(list);

        for(Person p : list){
            System.out.println(p.name);
        }
    }
}
