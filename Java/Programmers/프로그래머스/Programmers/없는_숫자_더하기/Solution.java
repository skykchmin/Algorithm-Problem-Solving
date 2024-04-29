package 없는_숫자_더하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

        Integer[] numbersArray = Arrays.stream(numbers).boxed().toArray(Integer[]::new);

        for (int i = 0; i < numbersArray.length; i++) {
            if (arrayList.contains(numbersArray[i])) {
                arrayList.remove(numbersArray[i]);
            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            answer += arrayList.get(i);
        }


        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();

        Scanner sc = new Scanner(System.in);
        String next = sc.nextLine();
        String[] split = next.split(" ");

        int[] array = Stream.of(split).mapToInt(Integer::parseInt).toArray();
        int solution = T.solution(array);
        System.out.println(solution);
    }
}