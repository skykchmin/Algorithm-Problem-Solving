import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int count = 0;
    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<String> arr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            arr.add(sc.next());
        }

        T.solution(arr);

    }

    public int isPalindrome(String str, int lt, int rt){
        count++;
        if(lt >= rt){
            return 1;
        } else if(str.charAt(lt) != str.charAt(rt)){
            return 0;
        } else {
            return isPalindrome(str, lt + 1, rt - 1);
        }
    }

    private void solution(ArrayList<String> arr) {

        for(int i = 0; i < arr.size(); i++){
            count = 0;
            int palindrome = isPalindrome(arr.get(i), 0, arr.get(i).length() - 1);

            System.out.println(palindrome + " " + count);
        }
    }
}
