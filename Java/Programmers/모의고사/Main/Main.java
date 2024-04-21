import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public int[] solution(int[] answers) {
        ArrayList<Integer> arrA = new ArrayList<>();
        ArrayList<Integer> arrB = new ArrayList<>();
        ArrayList<Integer> arrC = new ArrayList<>();

        List<Integer> tempAList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> tempBList = Arrays.asList(2, 1, 2, 3, 2, 4, 2, 5);
        List<Integer> tempCList = Arrays.asList(3, 3, 1, 1, 2, 2, 4, 4, 5, 5);
        for(int i = 0; i < answers.length; i++){
            arrA.add(tempAList.get(i % 5));
            arrB.add(tempBList.get(i % 8));
            arrC.add(tempCList.get(i % 10));
        }

        int[] temp = new int[3];

        for(int i = 0; i < answers.length; i++){
            if(arrA.get(i) % answers[i] == 0){
                temp[0] += 1;
            }
            if(arrB.get(i) % answers[i] == 0){
                temp[1] += 1;
            }
            if(arrC.get(i) % answers[i] == 0){
                temp[2] += 1;
            }
        }

        int maxScore = Arrays.stream(temp).max().getAsInt();

//        int[] answer = new int[3];
        ArrayList<Integer> answerList = new ArrayList<>();

        for(int i = 0; i < 2; i++){
            if(temp[i] == maxScore){
                answerList.add(i+1);
            }
        }

        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();

        return answer;

    }

    public int[] solutionLecture(int[] answers){
        int[][] pattern = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] scores = new int[3];

        for(int i = 0; i < answers.length; i++){
            for(int j = 0; j < pattern.length; j++){
                if(answers[i] == pattern[j][i % pattern[j].length]){
                    scores[j]++;
                }
            }
        }

        int maxScore = Arrays.stream(scores).max().getAsInt();

        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < scores.length; i++){
            if(scores[i] == maxScore){
                answer.add(i + 1);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        sc.close();

        String[] strings = inputStr.split(" ");

        int[] answers = Stream.of(strings).mapToInt(Integer::parseInt).toArray();

        int[] solution = T.solution(answers);
        for (int i : solution) {
            System.out.println(i + " ");
        }
    }


}
