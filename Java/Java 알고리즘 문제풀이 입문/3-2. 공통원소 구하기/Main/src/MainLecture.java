import java.util.*;

public class MainLecture {
    public static void main(String[] args) {
        MainLecture T = new MainLecture();

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

    public List<Integer> solution(int num1, int num2, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int p1 = 0, p2 = 0;

        while(p1 < num1 && p2 < num2){
            if(arr1[p1]==arr2[p2]){
                answer.add(arr1[p1++]);
                p2++;
            } else if (arr1[p1] < arr2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }

        return answer;
    }
}
