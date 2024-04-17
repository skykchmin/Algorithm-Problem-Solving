import java.util.*;

public class Main {

    public List<Integer> solution(int[] arr1, int[] arr2) {

        List<Integer> temp = new ArrayList<Integer>();
        for (int i : arr1) {
            temp.add(i);
        }

        for (int j : arr2){
            temp.add(j);
        }

        Collections.sort(temp);

        return temp;
    }

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
        for(int i = 0; i < num2; i++){
            arr2[i] = sc.nextInt();
        }

        sc.close();
        List<Integer> answer = T.solution(arr1, arr2);

        for(int i = 0; i < answer.size(); i++){
            System.out.print(answer.get(i) + " ");
        }
    }


}
