import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public class Person implements Comparable<Person>{
        int age;
        String name;
        int index;

        public Person(int age, String name, int index){
            this.age = age;
            this.name = name;
            this.index = index;
        }


        @Override
        public int compareTo(Person p){
            if(this.age == p.age){
                return this.index - p.index;
            } else {
                return this.age - p.age;
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        String[][] arr = new String[N][2];

        for(int i = 0; i < N; i++){
            String[] temp = new String[2];

            String[] strings = sc.nextLine().split(" ");
            temp[0] = strings[0];
            temp[1] = strings[1];

            arr[i] = temp;
        }

        T.solution(arr);
    }

    private void solution(String[][] arr) {

        List<Person> personList = new ArrayList<Person>();

        for(int i = 0; i < arr.length; i++){
            // 클래스 형태에 맞게 변경
            int age = Integer.parseInt(arr[i][0]);
            String name = arr[i][1];
            int idx = i;

            Person person = new Person(age, name, idx);
            personList.add(person);
        }

        Collections.sort(personList);

        for(Person person : personList){
            System.out.println(person.age + " " + person.name);
        }
    }
}
