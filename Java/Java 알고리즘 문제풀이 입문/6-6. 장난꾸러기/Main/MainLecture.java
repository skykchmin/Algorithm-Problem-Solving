import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainLecture {
    public static void main(String[] args) {
        MainLecture T = new MainLecture();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int x : T.solution(n, arr)){
            System.out.print(x + " ");
        }
    }

    private ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        int[] temp = arr.clone();

        for(int i = 0; i < n; i++){
            if(arr[i] != temp[i]){
                answer.add(i + 1);
            }
        }

        return answer;
    }
}
