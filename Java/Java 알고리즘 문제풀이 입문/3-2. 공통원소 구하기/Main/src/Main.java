import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        int[] arr1 = new int[num1];
        for(int i = 0; i < num1; i++){
            arr1[i] = sc.nextInt();
        }

        int num2 = sc.nextInt();
        int[] arr2 = new int[num2];
        for(int j = 0; j < num2; j++){
            arr2[j] = sc.nextInt();
        }

        List<Integer> solution = T.solution(num1, num2, arr1, arr2);
        for(int i : solution){
            System.out.print(i + " ");
        }
    }

    private List<Integer> solution(int num1, int num2, int[] arr1, int[] arr2) {
        List<Integer> a = Arrays.stream(Arrays.stream(arr1)
                        .boxed().toArray(Integer[]::new))
                .sorted()
                .collect(Collectors.toList());

        List<Integer> b = Arrays.stream(Arrays.stream(arr2)
                        .boxed().toArray(Integer[]::new))
                .sorted()
                .collect(Collectors.toList());

        List<Integer> answers = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;

        while (p1 < num1 && p2 < num2){
            if(a.get(p1) < b.get(p2)){ // b가 더 클 때
                p1++;
            } else if (a.get(p1) > b.get(p2)) { // a가 더 클 때
                p2++;
            } else {
                answers.add(a.get(p1));
                p1++;
                p2++;
            }
        }

        return answers;
    }
}